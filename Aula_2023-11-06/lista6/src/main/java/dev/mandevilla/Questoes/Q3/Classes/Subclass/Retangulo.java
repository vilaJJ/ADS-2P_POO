package dev.mandevilla.Questoes.Q3.Classes.Subclass;

import dev.mandevilla.Questoes.Q3.Classes.Superclass.Forma;

public class Retangulo extends Forma{
    private final float comprimento;
    private final float largura;
    
    public Retangulo(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public float getLargura() {
        return largura;
    }

    @Override
    public double calcularArea() throws Exception {
        return comprimento * largura;
    }
}
