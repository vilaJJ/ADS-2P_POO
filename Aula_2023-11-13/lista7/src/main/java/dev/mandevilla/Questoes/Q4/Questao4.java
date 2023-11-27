package dev.mandevilla.Questoes.Q4;

import dev.mandevilla.Questoes.Q4.Classes.Subclasses.CartaEspecial;
import dev.mandevilla.Questoes.Q4.Classes.Subclasses.CartaNormal;

public class Questao4 {
    private static final CartaNormal cartaNormal = new CartaNormal(
        "Alvareza da Sombra", 
        35, 
        18
    );

    private static final CartaEspecial cartaEspecial = new CartaEspecial(
        "Chama Sombria", 
        65, 
        30
    );

    public static void executar() {
        System.out.println("----------------------------------------------------------------------");
        cartaNormal.conjurarDefesa();
        cartaNormal.invocarAtaque();
        cartaNormal.invocarEspecial();

        System.out.println("----------------------------------------------------------------------");
        cartaEspecial.conjurarDefesa();
        cartaEspecial.invocarAtaque();
        cartaEspecial.invocarUltimate();
    }
}
