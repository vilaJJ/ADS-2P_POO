/*
3 – Peça ao usuário para digitar várias idades. Exiba quantas pessoas são maiores de idade (18 anos) e quantas são menores.
 */
package com.mandevilla.dev.arrays_lista4.Questoes;

import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-04
 */
public class TerceiraQuestao {
    private class Pessoa{
        final private String nome;
        final private int idade;
        final private boolean maioridade;
        
        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
            maioridade = this.idade >= 18;
        }
    }
    
    private int apresentarPessoas(Pessoa[] pessoas, boolean maioridade){
        int quantidadePessoas = 0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa.maioridade == maioridade) {
                System.out.printf(
                        "%s, %d anos de idade.\n", 
                        pessoa.nome, 
                        pessoa.idade
                );
                quantidadePessoas++;
            }
        }
        
        return quantidadePessoas;
    }
    
    public void Executar(){
        var scanner = new Scanner(System.in);
        
        System.out.print("Quantas pessoas deseja cadastrar? ");
        var quantidadePessoas = scanner.nextInt();
        
        var pessoas = new Pessoa[quantidadePessoas];
        
        System.out.println("============================================");
        for (int i = 0; i < quantidadePessoas; i++) {
            scanner.nextLine();
            System.out.println(String.format(
                    "Inserindo a %d° pessoa de %d:", 
                    i + 1, 
                    quantidadePessoas
            ));
            
            System.out.print("Insira o nome: ");
            var nome = scanner.nextLine();
            
            System.out.printf("Insira a idade de %s: ", nome);
            int idade = scanner.nextInt();
            
            pessoas[i] = new Pessoa(nome, idade);
            
            System.out.println("============================================");
        }
        
        System.out.println("Apresentando pessoas maiores de idade:\n");
        if(apresentarPessoas(pessoas, true) == 0){
            System.out.println("Não existem maiores de idade cadastrados.");
        }
        
        System.out.println("============================================");
        
        System.out.println("Apresentando pessoas menores de idade:\n");
        if(apresentarPessoas(pessoas, false) == 0){
            System.out.println("Não existem menores de idade cadastrados.");
        }

        scanner.close();
    }
}
