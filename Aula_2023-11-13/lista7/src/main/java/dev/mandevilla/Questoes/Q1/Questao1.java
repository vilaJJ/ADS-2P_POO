package dev.mandevilla.Questoes.Q1;

import dev.mandevilla.Questoes.Q1.Classes.Subclasses.Carro;
import dev.mandevilla.Questoes.Q1.Classes.Subclasses.Moto;
import dev.mandevilla.Questoes.Q1.Classes.Superclasses.Corrida;

public class Questao1 {
    private final static Corrida corrida = new Corrida();
    private final static Carro carro = new Carro();
    private final static Moto moto = new Moto();

    public static void executar() {
        System.out.println("-----------------------------------");
        corrida.iniciar(carro);
        
        System.out.println("-----------------------------------");
        corrida.iniciar(moto);
    }
}
