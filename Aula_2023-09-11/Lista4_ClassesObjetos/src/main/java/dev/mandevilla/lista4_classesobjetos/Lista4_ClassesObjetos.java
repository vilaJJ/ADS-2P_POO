/*
Lista 4 de Programação Orientada a Objetos.
Atividade voltada para praticar a criação de classes, métodos e propriedades, e instânciar.
 */

package dev.mandevilla.lista4_classesobjetos;

import dev.mandevilla.lista4_classesobjetos.Questao1.Questao1;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-11
 */
public class Lista4_ClassesObjetos {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int questao;
        
        try{
            while(true){
                System.out.print("Escolha das alternativas 1 a 6 para serem executadas (0 encerra o programa): ");
                questao = scanner.nextInt();
                
                switch(questao){
                    case 0:
                        System.out.println("\nEncerrando o programa...");
                        return;
                    case 1:
                        Questao1.executar();
                        return;
                }
            }
        }
        catch (Exception ex){
            System.out.println(String.format("Erro na execução do programa. %s", ex.getMessage()));
        }
    }
}
