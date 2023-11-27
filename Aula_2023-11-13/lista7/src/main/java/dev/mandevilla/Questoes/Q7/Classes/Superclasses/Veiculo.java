package dev.mandevilla.Questoes.Q7.Classes.Superclasses;

public class Veiculo {
    private final String marca;
    private final String modelo;
    private final int ano;
    
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
