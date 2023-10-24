package dev.mandevilla.Questoes.Questao6;

import dev.mandevilla.Questoes.Questao6.Classes.ParOrdenado;
import dev.mandevilla.Questoes.Questao6.Classes.Ponto;

public class Questao6 {
    public static void executar() {
        ParOrdenado parOrdenado1 = new ParOrdenado(15, 10);
        ParOrdenado parOrdenado2 = new ParOrdenado(8, 5);

        Ponto ponto1 = new Ponto(parOrdenado1);
        Ponto ponto2 = new Ponto(parOrdenado2);

        Double distancia = ponto1.calcularDistancia(ponto2);

        System.out.println(String.format("Distância entre Ponto 1 e Ponto 2 -> %f", distancia));
    }
}
