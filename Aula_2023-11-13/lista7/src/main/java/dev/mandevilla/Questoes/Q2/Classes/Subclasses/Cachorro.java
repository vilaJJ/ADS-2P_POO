package dev.mandevilla.Questoes.Q2.Classes.Subclasses;

import dev.mandevilla.Questoes.Q2.Classes.Superclasses.Animal;

public class Cachorro extends Animal { 
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(
            String.format(
                "O cachorro %s está latindo...",
                getNome()
            )
        );
    }
}
