package dev.mandevilla.Questoes.Q7.Classes.Subclasses;

import dev.mandevilla.Questoes.Q7.Classes.Superclasses.Veiculo;

public class CarroEletrico extends Veiculo {
    private int cargaBateria;

    public CarroEletrico(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
        cargaBateria = 0;
    }

    public int getCargaBateria() {
        return cargaBateria;
    }

    public void utilizarVeiculo() {
        if (cargaBateria < 10) {
            System.out.println("Não é possível utilizar o carro, a bateria está baixa. Carregue-o.");
        }

        cargaBateria -= 10;
    }

    public void carregarBateria() {
        if (cargaBateria == 100) {
            System.out.println("O veículo já está carregado no máximo.");
        }

        for (int i = cargaBateria; i < 100; i++) {
            cargaBateria++;
        }
    }
}
