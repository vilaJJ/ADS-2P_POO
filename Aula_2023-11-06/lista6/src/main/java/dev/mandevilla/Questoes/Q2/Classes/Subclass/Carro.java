package dev.mandevilla.Questoes.Q2.Classes.Subclass;

import dev.mandevilla.Questoes.Q2.Classes.Superclass.Veiculo;

public class Carro extends Veiculo {
    private final int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }
}
