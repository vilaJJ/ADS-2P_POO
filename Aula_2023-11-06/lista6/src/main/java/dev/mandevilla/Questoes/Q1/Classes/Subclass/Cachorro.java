package dev.mandevilla.Questoes.Q1.Classes.Subclass;

import dev.mandevilla.Questoes.Q1.Classes.Superclass.Animal;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está latindo...");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está se locomovendo...");
    }
}
