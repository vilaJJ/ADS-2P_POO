package dev.mandevilla.Questoes.Q3.Classes.Subclasses;

import dev.mandevilla.Questoes.Q3.Classes.Superclasses.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {
    private final double base;
    private final double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}
