/*
2. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. 
Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que uma rodela de hambúrguer pesa 100 gramas, faça um algoritmo em Java em que o dono forneça a quantidade de sanduíches a fazer. 
Escreva no navegador as quantidades (em quilos) de queijo, presunto e carne necessários para compra. Dica: utilize Classe, métodos e objetos. 
 */
package dev.mandevilla.lista4_classesobjetos.Questoes;

import dev.mandevilla.lista4_classesobjetos.Classes.LanchoneteGostosura;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-11
 */
public class Questao2 {
    public static void executar(){
        var scanner = new Scanner(System.in);
        
        System.out.print("Insira a quantidade de sanduíches: ");
        var qntdSanduiches = scanner.nextInt();
        
        var lanchonete = new LanchoneteGostosura(qntdSanduiches);
        
        System.out.println(lanchonete.getRelatorioPeso());        
    }
}
