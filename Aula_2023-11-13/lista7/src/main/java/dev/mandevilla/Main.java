package dev.mandevilla;

import java.util.Scanner;

import dev.mandevilla.Questoes.Q1.Questao1;
import dev.mandevilla.Questoes.Q2.Questao2;
import dev.mandevilla.Questoes.Q3.Questao3;
import dev.mandevilla.Questoes.Q4.Questao4;
import dev.mandevilla.Questoes.Q5.Questao5;
import dev.mandevilla.Questoes.Q6.Questao6;
import dev.mandevilla.Questoes.Q7.Questao7;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Selecione a questão a ser executada (1 a 7): ");
        int questaoExecutar = scanner.nextInt();

        if (questaoExecutar == 1) {
            Questao1.executar();
        }
        else if (questaoExecutar == 2) {
            Questao2.executar();
        }
        else if (questaoExecutar == 3) {
            Questao3.executar();
        }
        else if (questaoExecutar == 4) {
            Questao4.executar();
        }
        else if (questaoExecutar == 5) {
            Questao5.executar();
        }
        else if (questaoExecutar == 6) {
            Questao6.executar();
        }
        else if (questaoExecutar == 7) {
            Questao7.executar();
        }
        else {
            System.out.println("Valor de alternativa inválida.");
        }

        System.out.println("\n-> Encerrando programa...");
        scanner.close();
    }
}