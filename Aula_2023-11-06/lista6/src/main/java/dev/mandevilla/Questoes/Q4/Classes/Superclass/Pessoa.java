package dev.mandevilla.Questoes.Q4.Classes.Superclass;

public abstract class Pessoa {
    private final String nome;
    private final int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
