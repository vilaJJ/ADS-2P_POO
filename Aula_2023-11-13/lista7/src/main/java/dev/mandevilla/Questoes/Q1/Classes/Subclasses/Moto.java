package dev.mandevilla.Questoes.Q1.Classes.Subclasses;

import dev.mandevilla.Questoes.Q1.Classes.Superclasses.Veiculo;

public class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Acelerando a moto...");    
    }    
}
