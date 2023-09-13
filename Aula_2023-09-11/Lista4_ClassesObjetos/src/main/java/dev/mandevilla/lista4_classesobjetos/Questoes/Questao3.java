/*
3. Alguns países medem a temperatura em graus Celsius (C) e outros em Fahrenheit (F). 
Faça um algoritmo em Java para ler uma temperatura em Celsius (C) e escreva o resultado no navegador em Fahrenheit (F). 
A fórmula para converter de Celsius (C) para Fahrenheit (F) é: F = 1.8C + 32 

Dica: utilize Classe, métodos e objetos. 
*/
package dev.mandevilla.lista4_classesobjetos.Questoes;

import dev.mandevilla.lista4_classesobjetos.Classes.Questao3.TermometroCelsius;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-11
 */
public class Questao3 {
    public static void executar(){
        var scanner = new Scanner(System.in);
        
        System.out.print("Insira uma temperatura em graus Celsius (°C): ");
        var tempCelsius = scanner.nextFloat();
        
        var termCelsius = new TermometroCelsius(tempCelsius);
        
        System.out.println(String.format(
                "\n%.1f°C é igual à %.1f°F",
                termCelsius.getMedicao(),
                termCelsius.getFahrenheit()
        ));
    }
}
