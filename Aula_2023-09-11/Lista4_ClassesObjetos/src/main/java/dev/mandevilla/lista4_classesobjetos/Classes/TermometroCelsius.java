/*
3. Alguns países medem a temperatura em graus Celsius (C) e outros em Fahrenheit (F). 
Faça um algoritmo em Java para ler uma temperatura em Celsius (C) e escreva o resultado no navegador em Fahrenheit (F). 
A fórmula para converter de Celsius (C) para Fahrenheit (F) é: F = 1.8C + 32 

Dica: utilize Classe, métodos e objetos. 
*/
package dev.mandevilla.lista4_classesobjetos.Classes;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-11
 */
public class TermometroCelsius {
    private float medicao;
    
    public TermometroCelsius(float medicao){
        this.medicao = medicao;
    }
    
    public float getMedicao(){
        return this.medicao;
    }
    public void setMedicao(float value){
        this.medicao = value;
    }
    
    public float getFahrenheit(){
        return ((1.8f * this.medicao) + 32);
    }
}
