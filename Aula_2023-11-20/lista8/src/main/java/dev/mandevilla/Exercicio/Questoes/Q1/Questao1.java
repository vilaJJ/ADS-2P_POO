package dev.mandevilla.Exercicio.Questoes.Q1;

import dev.mandevilla.Exercicio.Questoes.Q1.Classes.Pessoa;

public class Questao1 {
    private static int diaAtual = 27;
    private static int mesAtual = 11;
    private static int anoAtual = 2023;

    private static final Pessoa albert_einstein = new Pessoa("Albert Einstein");
    private static final Pessoa isaac_newton = new Pessoa("Isaac Newton");

    public static void executar() {
        System.out.println("--------------------------------------------------------------------");

        albert_einstein.ajustaDataDeNascimento(14, 03, 1879);
        isaac_newton.ajustaDataDeNascimento(04, 01, 1643);

        albert_einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        isaac_newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println(
            String.format(
                "Idades atuais de:\n\t-> %s (%d anos)\n\t-> %s (%d anos)",
                albert_einstein.informaNome(),
                albert_einstein.informaIdade(),
                isaac_newton.informaNome(),
                isaac_newton.informaIdade()
            )
        );
    }
}
