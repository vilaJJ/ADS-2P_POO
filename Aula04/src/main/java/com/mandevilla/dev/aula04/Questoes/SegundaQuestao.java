/*
2. Faça um algoritmo em JAVA que implemente uma função chamada calculadora, que 
recebe três valores como parâmetros, o primeiro valor é um inteiro, o segundo 
valor é um inteiro e o terceiro valor é um caracter. O valor caracter poderá ser 
uma soma ‘+’, subtração ‘-‘, multiplicação ‘*’ ou divisão ‘/’. Peça para o 
usuário entrar com o primeiro valor, segundo valor e o valor do caracter. A 
função calculadora vai ser responsável por realizar a operação do primeiro valor, 
segundo valor e utilizar o valor caracter apropriado para a operação e mostre o 
resultado no console.
 */
package com.mandevilla.dev.aula04.Questoes;

import java.util.Scanner;

public class SegundaQuestao {
    private double calculadora(int primeiroValor, int segundoValor, char operador) throws Exception{
        double resultado;
        
        try{
            switch(operador){
                case '+' -> {
                    resultado = primeiroValor + segundoValor;
                }
                case '-' -> {
                    resultado = primeiroValor - segundoValor;
                }
                case '*' -> {
                    resultado = primeiroValor * segundoValor;
                }
                case '/' -> {
                    if(segundoValor == 0){
                        throw new Exception("Não é possível dividir um número por zero.");
                    }
                    else{
                        resultado = primeiroValor / segundoValor;
                    }
                }
                case default -> {
                    throw new Exception("Operador aritmético inválido.");
                }
            }
        }
        catch (Exception ex){
            throw ex;
        }
        
        return resultado;
    }
    
    public void Executar() throws Exception{
        var scanner = new Scanner(System.in);
        
        System.out.print("Insira o primeiro valor inteiro: ");
        var primeiroValor = scanner.nextInt();
        
        System.out.print("Insira o operador ([+] [-] [*] [/]): ");
        var operador = scanner.next().charAt(0);
        
        System.out.print("Insira o segundo valor inteiro: ");
        var segundoValor = scanner.nextInt();
        
        var resultado = calculadora(primeiroValor, segundoValor, operador);
        System.out.println(String.format(
                "%d %s %d = %s",
                primeiroValor,
                operador,
                segundoValor,
                String.valueOf(resultado)
        ));
    }
}
