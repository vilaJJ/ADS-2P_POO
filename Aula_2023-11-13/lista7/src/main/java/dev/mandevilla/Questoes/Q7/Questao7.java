package dev.mandevilla.Questoes.Q7;

import dev.mandevilla.Questoes.Q7.Classes.Subclasses.CarroEletrico;

public class Questao7 {
    private static final CarroEletrico carroEletrico = new CarroEletrico(
        "Tesla", 
        "Expec W5", 
        2021
    );

    public static void executar() {
        carroEletrico.utilizarVeiculo();

        carroEletrico.carregarBateria();
        carroEletrico.carregarBateria();

        carroEletrico.utilizarVeiculo();
        carroEletrico.utilizarVeiculo();
        carroEletrico.utilizarVeiculo();

        System.out.println(
            String.format(
                "Carga atual da bateria: %d%%",
                carroEletrico.getCargaBateria()
            )
        );
    }
}
