/*
5. A Granja Frangotech possui um controle automatizado de cada frango de sua produção. 
No pé direito do frango há um anel com um chip de identificação; 
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50. 
Faça um algoritmo em Java para calcular o gasto total da granja para marcar todos os seus frangos. 
Leia como entrada a quantidade de frangos. 
Dica: utilize Classe, métodos e objetos.
 */
package dev.mandevilla.lista4_classesobjetos.Questoes;

import dev.mandevilla.lista4_classesobjetos.Classes.Questao5.GranjaFrangotech;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-14
 */
public class Questao5 {
    public static void executar(){
        var scanner = new Scanner(System.in);
        
        System.out.print("\nGranja Frangotech solicita:\nInforme a quantidade de frangos: ");
        var quantidadeFrangos = scanner.nextInt();
        
        var granja = new GranjaFrangotech(quantidadeFrangos);
        
        System.out.println(granja.getRelatorioGastos());
    }
}
