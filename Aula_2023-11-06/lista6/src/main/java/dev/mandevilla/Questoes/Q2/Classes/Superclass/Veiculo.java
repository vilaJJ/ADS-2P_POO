package dev.mandevilla.Questoes.Q2.Classes.Superclass;

public abstract class Veiculo {
    private final String marca;
    private final String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
