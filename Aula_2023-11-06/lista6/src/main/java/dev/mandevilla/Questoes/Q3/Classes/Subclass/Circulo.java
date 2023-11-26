package dev.mandevilla.Questoes.Q3.Classes.Subclass;

import dev.mandevilla.Questoes.Q3.Classes.Superclass.Forma;

public class Circulo extends Forma {
    private final double pi_constant;
    private final float raio;
    
    public Circulo(float raio) {
        pi_constant = Math.PI;
        this.raio = raio;        
    }

    public double getPi_constant() {
        return pi_constant;
    }

    public float getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() throws Exception {
        return pi_constant * Math.pow(raio, 2);
    }
}
