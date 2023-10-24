/*
1 – Calcule a média de 10 números digitados pelo usuário.
 */
package com.mandevilla.dev.arrays_lista4.Questoes;

import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-29
 */
public class PrimeiraQuestao {
    private double mediaAritmetica(double[] valores){
        double media = 0;
        for (int i = 0; i < valores.length; i++) {
            media += valores[i];
        }
        return media / valores.length;
    }
    
    public void Executar(){
        System.out.println("Calculando média de 10 valores:\n");
        var scanner = new Scanner(System.in);
        
        var medias = new double[10];
        
        for(int i = 0; i < medias.length; i++){
            System.out.print(String.format(
                    "Insira um %d° valor numérico: ", 
                    i + 1
            ));
            medias[i] = scanner.nextDouble();
        }
        
        var media = mediaAritmetica(medias);
        System.out.println(String.format("Média: %.2f", media));

        scanner.close();
    }
}