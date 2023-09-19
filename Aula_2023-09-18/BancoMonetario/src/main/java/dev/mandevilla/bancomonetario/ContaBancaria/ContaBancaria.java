package dev.mandevilla.bancomonetario.ContaBancaria;

import dev.mandevilla.bancomonetario.BancoMonetario;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-18
 */
public class ContaBancaria {
    private final int numeroConta;
    private String nomeTitular;
    private float saldo;
    
    public ContaBancaria(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nomeTitular = nome;
    }
    public ContaBancaria(int numeroConta, String nome, float saldoInicial) throws Exception{
        if (saldoInicial < 0) {
            var msgErro = "Não é permitido iniciar uma conta com saldo negativo.";
            BancoMonetario.informacaoBanco(msgErro);
            throw new Exception(msgErro);
        }
        
        this.numeroConta = numeroConta;
        this.nomeTitular = nome;
        saldo = saldoInicial;
    }
    
    public String obterNomeTitular(){
        return nomeTitular;
    }
    public void renomearNomeTitular(String value){
        if (value.isEmpty()) {
            var msgErro = "Não é possível definir um nome de titular vazio.";
            BancoMonetario.informacaoBanco(msgErro);
            return;
        }
        nomeTitular = value;
        
        System.out.println("\nNome de titular renoemado com sucesso.");
        System.out.println(String.format("Novo nome: %s", nomeTitular));
    }
    
    public float obterSaldo(){
        return saldo;
    }
    
    public void realizarDeposito(float value){
        if (value <= 0) {
            var msgErro = "Não é possível realizar depósitos com um valor menor ou igual a zero.";
            BancoMonetario.informacaoBanco(msgErro);
            return;
        }
        saldo += value;
        
        System.out.println("\nDepósito realizado com sucesso.");
        System.out.println(String.format("Novo saldo: R$ %.2f", obterSaldo()));
    }
    
    public void realizarSaque(float value) throws Exception{
        if (value <= 0) {
            var msgErro = "Não é possível realizar depósitos com um valor menor ou igual a zero.";
            BancoMonetario.informacaoBanco(msgErro);
            return;
        }
        
        if (saldo > 0) {
            saldo -= (value + BancoMonetario.TAXA_SAQUE);
            
            System.out.println(String.format("\nSaque de R$ %.2f realizado com sucesso.", value));
            System.out.println(String.format("Novo saldo: R$ %.2f", obterSaldo()));
        }
        else{
            BancoMonetario.informacaoBanco(
            "Não foi possível realizar o saque, pois sua conta está no Cheque Especial.\nNormalize a situação, para isso será necessário fazer com que o saldo da conta fique positivo."
            );
            return;
        }
        
        if (saldo < 0) {
            BancoMonetario.informacaoBanco("\nSua conta está negativa, entrou no Cheque Especial. Não será possível realizar saques até que o saldo esteja positivo.");
        }
    }
}
