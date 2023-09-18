/*
Lista 4 de Programação Orientada a Objetos.
Atividade voltada para praticar a criação de classes, métodos e propriedades, e instanciar.
 */

package dev.mandevilla.lista4_classesobjetos;

import dev.mandevilla.lista4_classesobjetos.Questoes.Questao1;
import dev.mandevilla.lista4_classesobjetos.Questoes.Questao2;
import dev.mandevilla.lista4_classesobjetos.Questoes.Questao3;
import dev.mandevilla.lista4_classesobjetos.Questoes.Questao4;
import dev.mandevilla.lista4_classesobjetos.Questoes.Questao5;
import dev.mandevilla.lista4_classesobjetos.Questoes.Questao6;
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
                    case 2:
                        Questao2.executar();
                        return;
                    case 3:
                        Questao3.executar();
                        return;
                    case 4:
                        Questao4.executar();
                        return;
                    case 5:
                        Questao5.executar();
                        return;
                    case 6:
                        Questao6.executar();
                        return;
                    default:
                        System.out.println("Alternativa não implementada! Tente novamente.\n");
                }
            }
        }
        catch (Exception ex){
            System.out.println(String.format("Erro na execução do programa. %s", ex.getMessage()));
        }
    }
}
