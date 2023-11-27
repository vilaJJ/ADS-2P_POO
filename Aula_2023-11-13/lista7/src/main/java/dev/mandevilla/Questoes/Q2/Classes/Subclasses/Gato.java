package dev.mandevilla.Questoes.Q2.Classes.Subclasses;

import dev.mandevilla.Questoes.Q2.Classes.Superclasses.Animal;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(
            String.format(
                "O gato %s está miando...",
                getNome()
            )
        );
    }
}
