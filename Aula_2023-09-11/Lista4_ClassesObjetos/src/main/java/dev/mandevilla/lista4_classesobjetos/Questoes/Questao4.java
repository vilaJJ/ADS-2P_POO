/*
4. A empresa Hipothelicus paga R$ 10,00 por hora normal trabalhada, e R$ 15,00 por hora extra. 
Faça um algoritmo em Java para calcular e escrever no navegador o salário bruto e o salário líquido do funcionário com base nas horas trabalhadas. 
Considere que o salário líquido do funcionário é igual ao salário bruto, descontado 10% de impostos. 
Dica: utilize Classe, métodos e objetos.
 */
package dev.mandevilla.lista4_classesobjetos.Questoes;

import dev.mandevilla.lista4_classesobjetos.Classes.Questao4.FuncionarioHipothelicus;
import dev.mandevilla.lista4_classesobjetos.Classes.Questao4.Hipothelicus;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-11
 */
public class Questao4 {
    public static void executar(){
        var funcionario = new FuncionarioHipothelicus(
                "Juan Felipe", 
                20, 
                5
        );
        var hipothelicus = new Hipothelicus();
        
        System.out.println(hipothelicus.getFuncRelatorio(funcionario));
    }
}
