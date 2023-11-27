package dev.mandevilla.Exercicio.Questoes.Q3.Classes;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private final String nome;
    private final List<Departamento> departamentos;

    public Universidade(String nome) {
        this.nome = nome;
        departamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDepartamento(int index) {
        return departamentos.get(index);
    }

    public void addDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }
}
