package dev.mandevilla.Questoes.Q4.Classes.Subclasses;

import dev.mandevilla.Questoes.Q4.Classes.Superclasses.Carta;

public class CartaEspecial extends Carta {
    public CartaEspecial(String nome, int danoAtaque, int armadura) {
        super(nome, danoAtaque, armadura);
    }

    @Override
    public void conjurarDefesa() {
        System.out.println(
            String.format(
                "Conjurando defesa de Carta Especial (armadura = %d)",
                getArmadura()
            )
        );
    }

    @Override
    public void invocarAtaque() {
        System.out.println(
            String.format(
                "Invocando ataque de Carta Especial (dano de ataque = %d)",
                getDanoAtaque()
            )
        );
    }

    public void invocarUltimate() {
        System.out.println(
            String.format(
                "A carta '%s' está invocando o Ultimate...",
                getNome()
            )
        );
    }
}
