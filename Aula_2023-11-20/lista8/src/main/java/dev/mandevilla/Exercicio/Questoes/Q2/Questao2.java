package dev.mandevilla.Exercicio.Questoes.Q2;

import dev.mandevilla.Exercicio.Questoes.Q2.Classes.Pessoa;
import dev.mandevilla.Exercicio.Questoes.Q2.Classes.Universidade;

public class Questao2 { 
    private static int diaAtual = 27;
    private static int mesAtual = 11;
    private static int anoAtual = 2023;
    
    private static final Universidade uniPrinceton = new Universidade("Universidade de Princeton");
    private static final Universidade uniCambrigde = new Universidade("Universidade de Cambridge");

    private static final Pessoa albert_einstein = new Pessoa("Albert Einstein", uniPrinceton);
    private static final Pessoa isaac_newton = new Pessoa("Isaac Newton", uniCambrigde);

    public static void executar() {
        albert_einstein.ajustaDataDeNascimento(14, 03, 1879);
        isaac_newton.ajustaDataDeNascimento(04, 01, 1643);

        albert_einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        isaac_newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println("--------------------------------------------------------------------");
        
        albert_einstein.apresentarOndeTrabalha();
        isaac_newton.apresentarOndeTrabalha();
    }
}
