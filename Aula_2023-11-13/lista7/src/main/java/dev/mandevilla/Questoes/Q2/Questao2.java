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
        
        for (Animal pet : pets) {
            pet.fazerSom();
        }
    }
}
