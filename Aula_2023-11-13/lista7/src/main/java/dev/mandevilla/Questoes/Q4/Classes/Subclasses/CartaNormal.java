package dev.mandevilla.Questoes.Q4.Classes.Subclasses;

import dev.mandevilla.Questoes.Q4.Classes.Superclasses.Carta;

public class CartaNormal extends Carta {
    public CartaNormal(String nome, int danoAtaque, int armadura) {
        super(nome, danoAtaque, armadura);
    }

    @Override
    public void conjurarDefesa() {
        System.out.println(
            String.format(
                "Conjurando defesa de Carta Normal (armadura = %d)",
                getArmadura()
            )
        );
    }

    @Override
    public void invocarAtaque() {
        System.out.println(
            String.format(
                "Invocando ataque de Carta Normal (dano de ataque = %d)",
                getDanoAtaque()
            )
        );
    }

    public void invocarEspecial() {
        System.out.println(
            String.format(
                "A carta '%s' está invocando o ataque especial...",
                getNome()
            )
        );
    }
}
