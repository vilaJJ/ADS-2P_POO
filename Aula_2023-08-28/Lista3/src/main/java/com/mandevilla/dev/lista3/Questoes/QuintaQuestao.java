/*
5. Uma fábrica de camisetas produz os tamanhos, pequeno, médio e grande, cada 
uma sendo vendidas respectivamente por 10, 12 e 15 reais. Faça um algoritmo em 
JAVA em que o usuário forneça a quantidade de camisetas pequenas, médias e 
grandes referentes a uma venda, e o computador informe quanto será o valor 
arrecadado. Escreva o resultado do valor da venda no console.
 */
package com.mandevilla.dev.lista3.Questoes;

import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-28
 */
public class QuintaQuestao {
    private class PDVCamisetas{
        private int camisasP = 0;
        private int camisasM = 0;
        private int camisasG = 0;
        
        private final float valorCamisaP = 10;
        private final float valorCamisaM = 12;
        private final float valorCamisaG = 15;
        
        private boolean entradaValida(int value){
            if(value >= 0){
                return true;
            }
            else{
                System.out.println("Não é possível adicionar quantidade negativa.");
                return false;
            }
        }
        
        public void setCamisasP(int value){
            if(entradaValida(value)){
                camisasP = value;
            }
        }
        public void setCamisasM(int value){
            if(entradaValida(value)){
                camisasM = value;
            }
        }
        public void setCamisasG(int value){
            if(entradaValida(value)){
                camisasG = value;
            }
        }
        
        public String getResumoPedido(){
            return String.format(
                    "%d camisas pequenas\n%d camisas médias\n%d camisas grandes",
                    camisasP,
                    camisasM,
                    camisasG
            );
        }
        
        public float getValorTotal(){
            return (camisasP * valorCamisaP) + (camisasM * valorCamisaM) + (camisasG * valorCamisaG); 
        }
    }
    
    public void Executar(){
        var scanner = new Scanner(System.in);
        
        var compraCamisas = new PDVCamisetas();
        
        System.out.print("Insira a quantidade de camisas P: ");
        compraCamisas.setCamisasP(scanner.nextInt());
        
        System.out.print("Insira a quantidade de camisas M: ");
        compraCamisas.setCamisasM(scanner.nextInt());
        
        System.out.print("Insira a quantidade de camisas G: ");
        compraCamisas.setCamisasG(scanner.nextInt());
        
        System.out.println(compraCamisas.getResumoPedido());
        
        System.out.println(String.format(
                "Valor total: R$ %.2f", 
                compraCamisas.getValorTotal()
        ));
    }
}