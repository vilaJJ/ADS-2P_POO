/*
4. A empresa Hipothelicus paga R$ 10,00 por hora normal trabalhada, e R$ 15,00 por hora extra. 
Faça um algoritmo em Java para calcular e escrever no navegador o salário bruto e o salário líquido do funcionário com base nas horas trabalhadas. 
Considere que o salário líquido do funcionário é igual ao salário bruto, descontado 10% de impostos. 
Dica: utilize Classe, métodos e objetos.
 */
package dev.mandevilla.lista4_classesobjetos.Classes.Questao4;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-13
 */
public class FuncionarioHipothelicus {
    private final String nome;
    private float horaNormalTrabalhada;
    private float horaExtraTrabalhada;
    
    public FuncionarioHipothelicus(String nome, float horaNormalTrabalhada, float horaExtraTrabalhada){
        this.nome = nome;
        this.horaNormalTrabalhada = horaNormalTrabalhada;
        this.horaExtraTrabalhada = horaExtraTrabalhada;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public float getHoraNormalTrabalhada(){
        return this.horaNormalTrabalhada;
    }
    public void adicionarHoraNormalTrabalhada(float value){
        this.horaNormalTrabalhada += value;
    }
    
    public float getHoraExtraTrabalhada(){
        return this.horaExtraTrabalhada;
    }
    public void adicionarHoraExtraTrabalhada(float value){
        this.horaExtraTrabalhada += value;
    }
}
