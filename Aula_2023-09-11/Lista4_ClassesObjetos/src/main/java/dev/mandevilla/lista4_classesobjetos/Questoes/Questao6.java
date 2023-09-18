/*
6. A declaração de imposto de renda deve ser enviada anualmente para a Receita Federal. 
Faça um algoritmo em Java que calcula a alíquota, com base na tabela, a ser descontado do salário de uma pessoa física. 
Entre com o salário da pessoa física e escreva, no navegador, o salário bruto e o salário líquido, já com o desconto da alíquota. 
Dica: utilize Classe, métodos e objetos.

Base de cálculo mensal em R$            Alíquota %              Parcela a deduzir do imposto em R$
Até 1.787,77                            Isento                  0
De 1.787,78 até 2.679,29                7,5                     134,08
De 2.679,30 até 3.572,43                15,0                    335,03
De 3.572,44 até 4.463,81                22,5                    602,96
Acima de 4.463,81                       27,5                    826,15
 */
package dev.mandevilla.lista4_classesobjetos.Questoes;

import dev.mandevilla.lista4_classesobjetos.Classes.Questao6.ReceitaFederal;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-14
 */
public class Questao6 {
    public static void executar() throws Exception{
        var scanner = new Scanner(System.in);
        
        System.out.print("Insira seu nome: ");
        var nome = scanner.nextLine();
        
        System.out.print("Insira seu rendimento mensal bruto: ");
        var rendaMensal = scanner.nextFloat();
        
        var rf = new ReceitaFederal(nome, rendaMensal);
        
        System.out.println(rf.getRelatorioMensal());
    }
}
