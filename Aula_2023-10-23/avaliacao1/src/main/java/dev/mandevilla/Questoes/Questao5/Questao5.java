package dev.mandevilla.Questoes.Questao5;

import dev.mandevilla.Questoes.Questao5.Classes.Calculadora;

public class Questao5 {
    public static void executar() throws Exception {
        Calculadora calculadora = new Calculadora();

        System.out.println(
            calculadora.realizarCalculo('+', 4, 5)
        );

        System.out.println(
            calculadora.realizarCalculo('-', 4, 5)
        );

        System.out.println(
            calculadora.realizarCalculo('*', 14, 3.75f)
        );

        System.out.println(
            calculadora.realizarCalculo('/', 4.0f, 8)
        );
    }
}
