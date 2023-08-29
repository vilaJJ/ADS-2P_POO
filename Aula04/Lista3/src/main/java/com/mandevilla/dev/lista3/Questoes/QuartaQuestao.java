/*
4. Faça um algoritmo em JAVA para calcular três notas de um aluno em uma 
disciplina e imprimir a sua média ponderada (as notas tem pesos 1, 2 e 3 
respectivamente). Caso a média do aluno for maior que 7 (sete), escreva, no 
console, ‘Aprovado’, caso contrário, ‘Reprovado’. Para calcular a média 
ponderada utilize a seguinte fórmula: 

Media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / somatório dos pesos
 */
package com.mandevilla.dev.lista3.Questoes;

import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-28
 */
public class QuartaQuestao {
    private class Aluno{
        private final double nota1;
        private final double nota2;
        private final double nota3;
        
        private final double peso1 = 1;
        private final double peso2 = 2;
        private final double peso3 = 3;
        private final double somaPesos = peso1 + peso2 + peso3;
        
        private boolean notaInvalida(double nota){
            return nota < 0 && nota > 10;
        }
        
        public double getMedia(){
            return ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / somaPesos;
        }
        
        public boolean aprovado(){
            return getMedia() >= 7;
        }
        
        public String getVeredito(){
            return aprovado() ? "Aprovado!" : "Reprovado!";
        }
        
        public Aluno(double nota1, double nota2, double nota3) throws Exception{
            if(notaInvalida(nota1) || notaInvalida(nota2) || notaInvalida(nota3)){
                throw new Exception("Insira notas entre 0 e 10.");
            }
            
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }
    }
    
    public void Executar() throws Exception{
        var scanner = new Scanner(System.in);
        
        System.out.print("Insira a primeira nota: ");
        var nota1 = scanner.nextDouble();
        
        System.out.print("Insira a segunda nota: ");
        var nota2 = scanner.nextDouble();
        
        System.out.print("Insira a terceira nota: ");
        var nota3 = scanner.nextDouble();
        
        var aluno = new Aluno(nota1, nota2, nota3);
        
        System.out.println(String.format(
                "Média do aluno: %.2f", 
                aluno.getMedia()
        ));
        
        System.out.println(aluno.getVeredito());
    }
}
