package dev.mandevilla.Questoes.Q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.mandevilla.Questoes.Q2.Classes.Subclasses.Cachorro;
import dev.mandevilla.Questoes.Q2.Classes.Subclasses.Gato;
import dev.mandevilla.Questoes.Q2.Classes.Superclasses.Animal;

public class Questao2 {
    private final static List<Animal> pets = new ArrayList<Animal>(
        Arrays.asList(
            new Cachorro("Nanico"),
            new Gato("Dudu"),
            new Gato("Bart"),
            new Cachorro("Fred")
        )
    );

    public static void executar() {
        System.out.println("-----------------------------------");
        
        /*
         * O que acontece aqui é que as classes 'Cachorro' e 'Gato' herdam de 'Animal'.
         * Apesar de a lista possuir instâncias de 'Cachorro' e 'Gato', também possui uma super instância de 'Animal'.
         * Desta forma, com a lista do tipo 'Animal', conseguimos acessar as instâncias filhas, e utilizar os métodos herdados.
         */
        for (Animal pet : pets) {
            pet.fazerSom();
        }
    }
}
