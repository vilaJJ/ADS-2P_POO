package dev.mandevilla.lista4_classesobjetos.Questao1.Classes;

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
