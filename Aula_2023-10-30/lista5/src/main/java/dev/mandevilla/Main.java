package dev.mandevilla;

import dev.mandevilla.Questoes.Q1.Questao1;
import dev.mandevilla.Questoes.Q2.Questao2;

public class Main {
    public static void main(String[] args) {
        int questaoExecutar = 2;
        // Questão 1:

        if (questaoExecutar == 1) {
            Questao1.executar();
        }
        else if (questaoExecutar == 2) {
            Questao2.executar();
        }
        else {
            System.out.println("Valor inválido.");
        }
    }
}