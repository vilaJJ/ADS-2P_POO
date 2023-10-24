/*
2 – Digite 5 números e verifique qual é o maior.
 */
package com.mandevilla.dev.arrays_lista4.Questoes;

import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-04
 */
public class SegundaQuestao {
    private int descobrirMaiorNumero(int[] numeros) throws Exception{
        if (numeros.length == 0) {
            throw new Exception("O vetor de entrada não contém elementos.");
        }
        
        int maiorNumero = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }
        return maiorNumero;
    }
    
    public void Executar() throws Exception{
        var scanner = new Scanner(System.in);
        
        var numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(String.format(
                    "Insira o %d° valor (tipo inteiro): ", 
                    i + 1
            ));
            numeros[i] = scanner.nextInt();
        }
        
        int maiorNumero = descobrirMaiorNumero(numeros);
        System.out.printf("Maior número inserido: %d", maiorNumero);

        scanner.close();
    }
}
