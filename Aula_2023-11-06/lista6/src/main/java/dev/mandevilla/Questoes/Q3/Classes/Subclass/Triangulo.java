package dev.mandevilla.Questoes.Q3.Classes.Subclass;

import dev.mandevilla.Questoes.Q3.Classes.Superclass.Forma;

public class Triangulo extends Forma {
    private final float base;
    private final float altura;
    
    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() throws Exception {
        return (base * altura) / 2;
    }
}
