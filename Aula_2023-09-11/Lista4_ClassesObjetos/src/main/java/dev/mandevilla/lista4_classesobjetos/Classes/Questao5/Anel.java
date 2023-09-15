/*
5. A Granja Frangotech possui um controle automatizado de cada frango de sua produção. 
No pé direito do frango há um anel com um chip de identificação; 
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50. 
Faça um algoritmo em Java para calcular o gasto total da granja para marcar todos os seus frangos. 
Leia como entrada a quantidade de frangos. 
Dica: utilize Classe, métodos e objetos.
 */
package dev.mandevilla.lista4_classesobjetos.Classes.Questao5;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-14
 */
public class Anel {
    private float valor;
    private int quantidadePorFrango;
    
    public Anel(float valor, int quantidadePorFrango){
        this.valor = valor;
        this.quantidadePorFrango = quantidadePorFrango;
    }
    
    public float getValor(){
        return this.valor;
    }
    public void setValor(float value){
        this.valor = value;
    }
    
    public int getQuantidadePorFrango(){
        return this.quantidadePorFrango;
    }
    public void setQuantidadePorFrango(int value){
        this.quantidadePorFrango = value;
    }
}
