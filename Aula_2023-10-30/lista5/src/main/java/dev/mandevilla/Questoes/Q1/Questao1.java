package dev.mandevilla.Questoes.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        List<Double> numeros = new ArrayList<>();

        System.out.println("Programa - Números (-999 para finalizar)\n");
        do {
            System.out.print("-> Insira um número: ");
            double numero = scanner.nextDouble();

            if (numero != -999) {
                numeros.add(numero);
            }
            else {
                System.out.println("\nOperação encerrada.\n");
                break;
            }
        } while (true);

        if (numeros.isEmpty()) {
            System.out.println("Nenhum valor foi inserido. Finalizando...\n");

            scanner.close();
            return;
        }

        double somaValores = 0;
        int qntdNumDigitada = numeros.size();
        double media = 0;
        double maiorValor = numeros.get(0);
        double menorValor = numeros.get(0);

        for(int i = 0; i < qntdNumDigitada; i++) {
            double num = numeros.get(i);

            somaValores += num;

            if (num > maiorValor) {
                maiorValor = num;
            }

            if (num < menorValor) {
                menorValor = num;
            }
        }

        media = somaValores / qntdNumDigitada;

        System.out.println(String.format(
            "-> Soma dos valores digitados: %.2f\n" +
            "-> Quantidade de números digitados: %d\n" + 
            "-> Média dos valores digitados: %.2f\n" +
            "-> Maior número digitado: %.2f\n" + 
            "-> Menor número digitado: %.2f\n", 
            somaValores,
            qntdNumDigitada,
            media,
            maiorValor,
            menorValor
        ));

        scanner.close();
    }
}