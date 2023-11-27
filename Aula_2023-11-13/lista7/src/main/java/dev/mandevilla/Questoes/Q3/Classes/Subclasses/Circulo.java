package dev.mandevilla.Questoes.Q3.Classes.Subclasses;

import dev.mandevilla.Questoes.Q3.Classes.Superclasses.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
