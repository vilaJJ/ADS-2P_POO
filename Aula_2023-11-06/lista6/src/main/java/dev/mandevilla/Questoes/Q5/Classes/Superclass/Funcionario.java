package dev.mandevilla.Questoes.Q5.Classes.Superclass;

public abstract class Funcionario {
    private final int id;
    private final String nome;
    private final double salario;
    
    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
