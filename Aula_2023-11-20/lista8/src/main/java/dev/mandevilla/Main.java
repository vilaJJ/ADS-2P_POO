package dev.mandevilla;

import java.util.Scanner;

import dev.mandevilla.Exercicio.Questoes.Q1.Questao1;
import dev.mandevilla.Exercicio.Questoes.Q2.Questao2;
import dev.mandevilla.Exercicio.Questoes.Q3.Questao3;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a questão para ser executada (1 a 3): ");
        int questaoExecutar = scanner.nextInt();

        switch (questaoExecutar) {
            case 1:
                Questao1.executar();
                break;
            
            case 2:
                Questao2.executar();
                break;
            
            case 3:
                Questao3.executar();
                break;

            default:
                System.out.println("Nenhuma opção válida selecionada.");
                break;
        }

        System.out.println("\nEncerrando o programa...");
        scanner.close();
    }
}