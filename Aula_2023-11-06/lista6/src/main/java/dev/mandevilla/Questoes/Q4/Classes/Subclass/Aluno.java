package dev.mandevilla.Questoes.Q4.Classes.Subclass;

import dev.mandevilla.Questoes.Q4.Classes.Superclass.Pessoa;

public class Aluno extends Pessoa {
    private final String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
}
