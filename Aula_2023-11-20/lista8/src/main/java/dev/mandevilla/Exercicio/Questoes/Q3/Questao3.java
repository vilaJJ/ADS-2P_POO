package dev.mandevilla.Exercicio.Questoes.Q3;

import dev.mandevilla.Exercicio.Questoes.Q3.Classes.Departamento;
import dev.mandevilla.Exercicio.Questoes.Q3.Classes.Pessoa;
import dev.mandevilla.Exercicio.Questoes.Q3.Classes.Universidade;

public class Questao3 { 
    private static int diaAtual = 27;
    private static int mesAtual = 11;
    private static int anoAtual = 2023;
    
    private static final Universidade uniPrinceton = new Universidade("Universidade de Princeton");
    private static final Universidade uniCambrigde = new Universidade("Universidade de Cambridge");

    private static final Departamento depFisicaQuantica = new Departamento("Departamento de Física Quântica");
    private static final Departamento depFisicaClassica = new Departamento("Departamento de Física Clássica");

    private static final Pessoa albert_einstein = new Pessoa("Albert Einstein", uniPrinceton, depFisicaQuantica);
    private static final Pessoa isaac_newton = new Pessoa("Isaac Newton", uniCambrigde, depFisicaClassica);

    public static void executar() {
        uniPrinceton.addDepartamento(depFisicaQuantica);
        uniCambrigde.addDepartamento(depFisicaClassica);

        albert_einstein.ajustaDataDeNascimento(14, 03, 1879);
        isaac_newton.ajustaDataDeNascimento(04, 01, 1643);

        albert_einstein.calculaIdade(diaAtual, mesAtual, anoAtual);
        isaac_newton.calculaIdade(diaAtual, mesAtual, anoAtual);

        System.out.println("--------------------------------------------------------------------");
        
        albert_einstein.apresentarOndeTrabalha();
        isaac_newton.apresentarOndeTrabalha();
    }
}
