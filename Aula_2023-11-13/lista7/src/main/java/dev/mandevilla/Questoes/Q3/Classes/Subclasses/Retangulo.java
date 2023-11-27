package dev.mandevilla.Questoes.Q3.Classes.Subclasses;

import dev.mandevilla.Questoes.Q3.Classes.Superclasses.FiguraGeometrica;

public class Retangulo extends FiguraGeometrica {
    private final double comprimento;
    private final double largura;
    
    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    @Override
    public double calcularArea() {
        return comprimento * largura;
    }    
}
