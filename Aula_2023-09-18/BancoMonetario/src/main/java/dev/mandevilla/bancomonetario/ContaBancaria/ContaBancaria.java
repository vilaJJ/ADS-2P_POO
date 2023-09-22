package dev.mandevilla.bancomonetario.ContaBancaria;

import dev.mandevilla.bancomonetario.Banco.Banco;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-18
 */
public class ContaBancaria {
    private final Banco banco;
    private final int numeroConta;
    private String nomeTitular;
    private float saldo;
    
    public ContaBancaria(Banco banco, int numeroConta, String nome){
        this.banco = banco;
        this.numeroConta = numeroConta;
        this.nomeTitular = nome;
        saldo = 0.00f;
    }
    public ContaBancaria(Banco banco, int numeroConta, String nome, float saldoInicial) throws Exception{
        if (saldoInicial < 0) {
            var msgErro = "Não é permitido iniciar uma conta com saldo negativo.";
            banco.informacaoBanco(msgErro);
            throw new Exception(msgErro);
        }
        this.banco = banco;
        this.numeroConta = numeroConta;
        this.nomeTitular = nome;
        saldo = saldoInicial;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
    
    public String obterInformacoesGerais(){
        var stringBuilder = new StringBuilder();
        var barras = "--------------------------------------------------------------\n";
        var situacaoConta = saldo < 0 ? "Em cheque especial" : "Normal";
        
        stringBuilder.append(barras);
        stringBuilder.append("Informações gerais da conta bancária:\n\n");
        stringBuilder.append(String.format("-> Número da conta: %d\n", numeroConta));
        stringBuilder.append(String.format("-> Nome do titular: %s\n\n", nomeTitular));
        stringBuilder.append(String.format("-> Saldo da conta: R$ %.2f\n", saldo));
        stringBuilder.append(String.format("-> Taxa por saque: R$ %.2f\n\n", banco.getTaxaSaque()));
        stringBuilder.append(String.format("-> Situação da conta: %s\n", situacaoConta));
        stringBuilder.append(barras);
        
        return stringBuilder.toString();
    }
    
    public String obterNomeTitular(){
        return nomeTitular;
    }
    public void renomearNomeTitular(String value){
        if (value.isEmpty()) {
            var msgErro = "Não é possível definir um nome de titular vazio.";
            banco.informacaoBanco(msgErro);
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
            banco.informacaoBanco(msgErro);
            return;
        }
        saldo += value;
        
        System.out.println("\nDepósito realizado com sucesso.");
        System.out.println(String.format("Novo saldo: R$ %.2f", obterSaldo()));
    }
    
    public void realizarSaque(float value) throws Exception{
        if (value <= 0) {
            var msgErro = "Não é possível realizar depósitos com um valor menor ou igual a zero.";
            banco.informacaoBanco(msgErro);
            return;
        }
        
        if (saldo > 0) {
            saldo -= (value + banco.getTaxaSaque());
            
            System.out.println(String.format("\nSaque de R$ %.2f realizado com sucesso.", value));
            System.out.println(String.format("Novo saldo: R$ %.2f", obterSaldo()));
        }
        else{
            banco.informacaoBanco(
            "Não foi possível realizar o saque, pois sua conta está no Cheque Especial.\nNormalize a situação, para isso será necessário fazer com que o saldo da conta fique positivo."
            );
            return;
        }
        
        if (saldo < 0) {
            banco.informacaoBanco("\nSua conta está negativa, entrou no Cheque Especial. Não será possível realizar saques até que o saldo esteja positivo.");
        }
    }
}
