package dev.mandevilla.Questoes.Q1.Classes.Superclass;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String value) {
        nome = value;
    }

    public void emitirSom() {
        System.out.println("Animal emitindo som...");
    }

    public void mover() {
        System.out.println("Animal se movendo...");
    }
}
