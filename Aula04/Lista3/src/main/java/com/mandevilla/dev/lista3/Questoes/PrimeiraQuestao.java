/*
1. Faça um algoritmo em JAVA para calcular a idade de uma pessoa e escrever na 
tela a mensagem se ela pode ou não tirar a Carteira Nacional de Habilitação 
(CNH). Se a pessoa tiver maior ou igual a 18 anos, ela poderá tirar a Carteira 
Nacional de Habilitação (CNH), escreva no console: “Você pode tirar a CNH!”, 
caso contrário, se a pessoa tiver a idade menor que 18 anos, escreva a mensagem 
no console: “Você ainda não pode tirar a CNH, tenha paciência!”. 
 */
package com.mandevilla.dev.lista3.Questoes;

import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-28
 */
public class PrimeiraQuestao {
    private class Pessoa{
        private final String nome;
        private final int idade;
        private final boolean maioridade;
        
        public void obterCNH(){
            var mensagem = maioridade 
                    ? "Você pode tirar a CNH!" 
                    : "Você ainda não pode tirar a CNH, tenha paciência!";
            var retorno = String.format("Oi %s, você tem %d anos. %s", nome, idade, mensagem);
            
            System.out.println(retorno);
        }
        
        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
            this.maioridade = idade >= 18;
        }
    }
    
    public void Executar(){
        var scanner = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();
       
        while(true){
            try{
                System.out.print("Insira sua idade: ");
                idade = scanner.nextInt();
                
                if(idade >= 0 && idade <= 200){
                    break;
                }
                else{
                    throw new Exception();
                }
            }
            catch (Exception ex){
                System.out.println("Erro na inserção. Insira apenas valores inteiros positivos, entre 0 e 200.\nTente novamente.\n\n");
            }
        }
        
        var pessoa = new Pessoa(nome, idade);
        pessoa.obterCNH();
    }
}