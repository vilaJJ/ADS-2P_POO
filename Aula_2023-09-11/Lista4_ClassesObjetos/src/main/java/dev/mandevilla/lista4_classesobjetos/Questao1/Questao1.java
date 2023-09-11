/*
1. Faça um algoritmo em Java para calcular o salário de um funcionário e aumentá-lo em 15%. Após o aumento, desconte 8% de impostos. Escreva no navegador o salário inicial, o salário com o aumento e o salário final. Dica: utilize Classe, métodos e objetos. 
 */
package dev.mandevilla.lista4_classesobjetos.Questao1;

import dev.mandevilla.lista4_classesobjetos.Questao1.Classes.Funcionario;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-11
 */
public class Questao1 {
    public static void executar(){
        var funcionario1 = new Funcionario("Juan Felipe", 1980);
        var funcionario2 = new Funcionario("Bárbara Ohana", 6000);
        var funcionario3 = new Funcionario("Beatriz Coelho", 1000);
        
        var funcionarios = new Funcionario[]{ funcionario1, funcionario2, funcionario3 };
        
        for (Funcionario funcionario : funcionarios) funcionario.aumento15Porcento();
        for (Funcionario funcionario : funcionarios) funcionario.apresentarFuncionario();
    }
}
