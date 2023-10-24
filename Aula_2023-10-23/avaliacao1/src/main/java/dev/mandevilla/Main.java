package dev.mandevilla;

import dev.mandevilla.Questoes.Questao1.Questao1;
import dev.mandevilla.Questoes.Questao2.Questao2;
import dev.mandevilla.Questoes.Questao3.Questao3;
import dev.mandevilla.Questoes.Questao4.Questao4;
import dev.mandevilla.Questoes.Questao5.Questao5;
import dev.mandevilla.Questoes.Questao6.Questao6;

public class Main {
    public static String barras = "------------------------------------------------------------------------";

    public static void main(String[] args) throws Exception {
        // Questão 1:
        System.out.println(barras);
        System.out.println("Executando Questão 1:\n");
        Questao1.executar();

        // Questão 2:
        System.out.println(barras);
        System.out.println("Executando Questão 2:\n");
        Questao2.executar();

        // Questão 3:
        System.out.println(barras);
        System.out.println("Executando Questão 3:\n");
        Questao3.executar();

        // Questão 4:
        System.out.println(barras);
        System.out.println("Executando Questão 4:\n");
        Questao4.executar();

        // Questão 5:
        System.out.println(barras);
        System.out.println("Executando Questão 5:\n");
        Questao5.executar();

        // Questão 6:
        System.out.println(barras);
        System.out.println("Executando Questão 6:\n");
        Questao6.executar();
    }
}