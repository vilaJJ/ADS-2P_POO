package dev.mandevilla.bancomonetario.Banco;

import dev.mandevilla.bancomonetario.ContaBancaria.ContaBancaria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-21
 */
public class Banco {
    private float taxaSaque;
    private final List<ContaBancaria> contasBancarias;
    
    public Banco(){
        taxaSaque = 5;
        contasBancarias = new ArrayList();
    }
    public Banco(float taxaSaque){
        this.taxaSaque = taxaSaque;
        contasBancarias = new ArrayList();
    }
    
    public boolean existeConta(int numeroConta){
        for (ContaBancaria contasBancaria : contasBancarias) {
            if (contasBancaria.getNumeroConta() == numeroConta) {
                return true;
            }
        }
        return false;
    }
    
    public void criarContaBancaria() throws Exception{
        var scanner = new Scanner(System.in);
        System.out.println("Realizando cadastro de conta bancária:\n");
        
        System.out.print("Insira o número da conta (apenas números): ");
        var numeroConta = scanner.nextInt();
        
        if (existeConta(numeroConta)) {
            informacaoBanco("O número de conta já existe. Tente novamente com outro valor.");
            return;
        }
        
        System.out.print("Insira o nome do titular: ");
        var nomeTitular = scanner.nextLine();
        
        ContaBancaria conta;
        
        System.out.print("Deseja iniciar o saldo da conta bancária (1 para sim, 0 para não): ");
        var iniciarSaldo = scanner.next().charAt(0) == '1';
        
        if (iniciarSaldo) {
            System.out.print("Insira o saldo inicial: R$ ");
            var saldoInicial = scanner.nextFloat();
            
            conta = new ContaBancaria(this, numeroConta, nomeTitular, saldoInicial);
        }
        else{
            conta = new ContaBancaria(this, numeroConta, nomeTitular);
        }
        
        contasBancarias.add(conta);
        System.out.println("\nConta criada com sucesso!");
    }
    
    // taxaSaque - getter and setter
    public float getTaxaSaque() {
        return taxaSaque;
    }
    public void setTaxaSaque(float taxaSaque) {
        this.taxaSaque = taxaSaque;
    }
    
    public String informacaoBanco(String value){
        return String.format("Banco Monetário informa: %s", value);
    }
}
