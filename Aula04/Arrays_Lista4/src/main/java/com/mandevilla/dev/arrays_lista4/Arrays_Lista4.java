package com.mandevilla.dev.arrays_lista4;

import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-29
 */
public class Arrays_Lista4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int questao;
       
        try{
            while(true){
                System.out.print("Escolha das alternativas 1 a 6 para serem executadas (0 encerra o programa): ");
                questao = scanner.nextInt();

                switch(questao){
                    case 0:
                        return;
                    default:
                        System.out.println("Alternativa não implementada! Tente novamente.\n");
                        break;
                }
            }
        }
        catch (Exception ex){
            System.out.println(String.format("Erro na execução do programa. %s", ex.getMessage()));
        }
    }
}