package dev.mandevilla.Questoes.Q2;

import java.util.Scanner;

public class Questao2 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor inteiro para calcular a tabuada de 0 a 10: ");
        int num = scanner.nextInt();

        System.out.println(String.format("Tabuada de %d:", num));

        for (int i = 0; i <= 10; i++) {
            System.out.println(String.format(
                "\t-> %d x %d = %d", 
                num,
                i,
                num * i
            ));
        }

        scanner.close();
    }
}
