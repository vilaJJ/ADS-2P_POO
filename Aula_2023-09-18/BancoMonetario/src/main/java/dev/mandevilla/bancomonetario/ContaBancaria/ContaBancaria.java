package dev.mandevilla.bancomonetario.ContaBancaria;

import dev.mandevilla.bancomonetario.Banco.Banco;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-18
 */
public class ContaBancaria {
    private final Banco banco;
    private final int numeroConta;
    private String nomeTitular;
    private float saldo;
    private List<String> extratos;
    private final Scanner scanner;
    
    public ContaBancaria(Banco banco, int numeroConta, String nome){
        this.banco = banco;
        this.numeroConta = numeroConta;
        this.nomeTitular = nome;
        saldo = 0.00f;
        extratos = new ArrayList<>();
        
        scanner = new Scanner(System.in);
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
        extratos = new ArrayList<>();
        
        extratos.add(String.format(
                "Operação: Depósito\nValor: R$ %.2f\nSaldo: R$ %.2f",
                saldoInicial, saldo
        ));
        
        scanner = new Scanner(System.in);
    }
    
    // Método de acesso a conta
    public void controlarConta() throws Exception{      
        System.out.println(String.format("\nOlá, %s.\n", nomeTitular));
        while(true){
            System.out.println("\nInsira a operação desejada:\n");
            System.out.println("[Código] -> Operação \n");
            
            System.out.println("[1] -> Informações gerais");
            System.out.println("[2] -> Obter extrato");
            System.out.println("[3] -> Movimentar dinheiro");
            System.out.println("[4] -> Configurações da conta");
            System.out.println("[0] -> Encerrar atendimento");
            
            System.out.print("\nInsira o código da operação: ");
            var codigo = scanner.nextInt();
            
            switch(codigo){
                case 0 -> {
                    System.out.println("Atendimento encerrado. Tenha um bom dia!");
                    return;
                }
                case 1 -> System.out.println(obterInformacoesGerais());
                case 2 -> imprimirExtrato();
                case 3 -> realizarMovimentacoes();
                case 4 -> configurarConta();
                default -> banco.informacaoBanco("Operação inválida, tente novamente.\n");
            }
        }
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
    
    public void imprimirExtrato(){
        System.out.println("-----------------------------------------------------");
        if (extratos.isEmpty()) {
            System.out.println("Sem operações para exibir em extrato.");
        }
        else{
            for(var extrato : extratos){
                System.out.println(String.format("%s\n", extrato));
            }
        }
        System.out.println("-----------------------------------------------------");
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
        
        extratos.add(String.format(
                "Operação: Depósito\nValor: R$ %.2f\nSaldo: R$ %.2f",
                value, saldo
        ));
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
        
        extratos.add(String.format(
                "Operação: Saque\nValor: R$ %.2f\nSaldo: R$ %.2f",
                value, saldo
        ));
    }
    
    // Private methods
    private void realizarMovimentacoes() throws Exception{
        System.out.println("Insira a operação de movimentação:\n");
        
        System.out.println("[1] -> Depósito");
        System.out.println("[2] -> Saque");
        System.out.println("[0] -> Retornar");
        
        System.out.print("\nInsira o código da operação: ");
        var codigo = scanner.nextInt();
        
        switch (codigo) {
            case 0 -> {
                break;
            }
            case 1 -> {
                System.out.print("Insira o valor de depósito: R$ ");
                var value = scanner.nextFloat();
                realizarDeposito(value);
            }
            case 2 -> {
                System.out.print("Insira o valor de saque: R$ ");
                var value = scanner.nextFloat();
                realizarSaque(value);
            }
            default -> banco.informacaoBanco("Operação inválida, tente novamente.");
        }
    }
    
    private void configurarConta(){
        System.out.println("Insira a operação de configuração:\n");
        
        System.out.println("[1] -> Modificar nome");
        System.out.println("[0] -> Retornar");
        
        System.out.print("\nInsira o código da operação: ");
        var codigo = scanner.nextInt();
        
        switch (codigo){
            case 1 -> {
                System.out.print("Insira o novo nome: ");
                scanner.nextLine(); // Consumir \n
                var value = scanner.nextLine();
                
                renomearNomeTitular(value);
            }
            default -> banco.informacaoBanco("Operação inválida, tente novamente.");
        }
    }
}
