/*
1. Faça um algoritmo em Java para calcular o salário de um funcionário e aumentá-lo em 15%. Após o aumento, desconte 8% de impostos. Escreva no navegador o salário inicial, o salário com o aumento e o salário final. Dica: utilize Classe, métodos e objetos. 
*/

package dev.mandevilla.lista4_classesobjetos.Classes.Questao1;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-11
 */
public class Funcionario {    
    private final String nome;
    private final float salarioInicial;
    private float salarioAtual;

    public Funcionario(String nome, float salario){
        this.nome = nome;
        this.salarioInicial = this.salarioAtual = salario;
    }
    
    public void aumento15Porcento(){
        salarioAtual += salarioAtual * 0.15;
        descontarImpostos();
    }
    
    private void descontarImpostos(){
        salarioAtual -= salarioAtual * 0.08;
    }
    
    public void apresentarFuncionario(){
        System.out.println("--------------------------------------------------------------------");
        
        System.out.println(String.format("Funcionário(a): %s\n", nome));
        System.out.println(String.format("Salário inicial: R$ %.2f", salarioInicial));
        System.out.println(String.format("Salário atual: R$ %.2f", salarioAtual));
    }
}
