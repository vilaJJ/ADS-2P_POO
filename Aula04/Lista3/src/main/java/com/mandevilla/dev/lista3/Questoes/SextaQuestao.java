/*
6. Faça um algoritmo em JAVA, para calcular a distância entre dois pontos do plano cartesiano.
Cada ponto é um par ordenado (x,y). A fórmula para calcular a distância entre dois pontos é:

Distancia = √(x1 – x2)² +(y1 – y2)²
 */
package com.mandevilla.dev.lista3.Questoes;

import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-28
 */
public class SextaQuestao {
    private class ParOrdenado{
        private final double pontoX;
        private final double pontoY;
        
        public double getPontoX() { return pontoX; }
        public double getPontoY() { return pontoY; }
        
        public ParOrdenado(double pontoX, double pontoY){
            this.pontoX = pontoX;
            this.pontoY = pontoY;
        }
    }
    
    private class PlanoCartesiano{
        private final ParOrdenado parX;
        private final ParOrdenado parY;
        
        public double getDistanciaPontos(){
            var primeiraParte = Math.sqrt(Math.pow(parX.getPontoX() - parX.getPontoY(), 2));
            var segundaParte = Math.pow(parY.getPontoX() - parY.getPontoY(), 2);
            
            return primeiraParte + segundaParte;
        }
        
        public PlanoCartesiano(ParOrdenado parX, ParOrdenado parY){
            this.parX = parX;
            this.parY = parY;
        }
    }
    
    public void Executar(){
        var scanner = new Scanner(System.in);
        
        System.out.print("Insira o ponto X do primeiro par ordenado: ");
        var parX_pontoX = scanner.nextDouble();
        
        System.out.print("Insira o ponto Y do primeiro par ordenado: ");
        var parX_pontoY = scanner.nextDouble();
        
        System.out.print("\nInsira o ponto X do segundo par ordenado: ");
        var parY_pontoX = scanner.nextDouble();
        
        System.out.print("Insira o ponto Y do segundo par ordenado: ");
        var parY_pontoY = scanner.nextDouble();
        
        var parX = new ParOrdenado(parX_pontoX, parX_pontoY);
        var parY = new ParOrdenado(parY_pontoX, parY_pontoY);
        
        var planoCartesiano = new PlanoCartesiano(parX, parY);
        
        System.out.println(String.format(
                "Distância entre os pontos: %.2f", 
                planoCartesiano.getDistanciaPontos()
        ));
    }
}
