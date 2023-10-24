/*
4 – Peça ao usuário para digitar vários nomes. Exiba na tela todos os nomes digitados, porém de maneira invertida (do último para o primeiro).
 */
package com.mandevilla.dev.arrays_lista4.Questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-04
 */
public class QuartaQuestao {
    private void inverterLista(List<String> nomes){
        for (int i = nomes.size(); i != 0; i--) {
            var posicao = i - 1;
            System.out.printf("nomes[%d] = %s\n", posicao, nomes.get(posicao));
        }
    }
    
    public void Executar(){
        var scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        
        System.out.println("Inserindo nomes (escreva 0 para finalizar):\n");
        
        while (true){
            System.out.print("Insira um nome (0 para finalizar): ");
            var nome = scanner.nextLine();
            
            if (nome.equals("0")) {
                System.out.println("\nOperação encerrada.");
                break;
            }
            nomes.add(nome);
        }
        
        System.out.println("\nApresentando nomes na ordem invertida de inserção:\n");
        inverterLista(nomes);

        scanner.close();
    }
}
