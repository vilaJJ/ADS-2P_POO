/*
 3. Faça um algoritmo em JAVA para verificar se dois valores númericos são 
iguais ou diferentes, caso sejam diferentes, verificar se o primeiro valor é 
maior ou menor que o segundo valor. Escreva no console o valor maior e o valor 
menor ou se são iguais. 
 */
package com.mandevilla.dev.lista3.Questoes;

import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-28
 */
public class TerceiraQuestao {
    private boolean valoresIguais(double primeiroValor, double segundoValor){
        if(primeiroValor == segundoValor){
            System.out.println("Os valores passados são iguais.");
            return true;
        }
        else{
            System.out.println("\nOs valores são diferentes.");
            
            var primeiroMaior = primeiroValor > segundoValor
                    ? String.format(
                            "primeiro valor (%s)", 
                            String.valueOf(primeiroValor)
                    )
                    : String.format(
                            "segundo valor (%s)",
                            String.valueOf(segundoValor)
                    );
            
            var primeiroMenor = primeiroValor < segundoValor
                    ? String.format(
                            "primeiro valor (%s)", 
                            String.valueOf(primeiroValor)
                    )
                    : String.format(
                            "segundo valor (%s)",
                            String.valueOf(segundoValor)
                    );
            
            System.out.println(String.format(
                        "O %s é maior que o %s.",
                        primeiroMaior,
                        primeiroMenor
            ));
            return false;
        }
    }
    
    public void Executar(){
        var scanner = new Scanner(System.in);
        
        System.out.print("Insira o primeiro valor númerico: ");
        var primeiroValor = scanner.nextInt();
        
        System.out.print("Insira o segundo valor númerico: ");
        var segundoValor = scanner.nextInt();
        
        var resultado = valoresIguais(primeiroValor, segundoValor);
        System.out.println(resultado);
    }
}
