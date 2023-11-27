package dev.mandevilla.Questoes.Q2.Classes.Superclasses;

public abstract class Animal {
    private final String nome;
   
    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void fazerSom();

    public String getNome() {
        return nome;
    }
}
