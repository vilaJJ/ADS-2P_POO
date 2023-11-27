package dev.mandevilla.Questoes.Q4.Classes.Superclasses;

public abstract class Carta {
    private final String nome;
    private final int danoAtaque;
    private final int armadura;

    public Carta(String nome, int danoAtaque, int armadura) {
        this.nome = nome;
        this.danoAtaque = danoAtaque;
        this.armadura = armadura;
    }

    public String getNome() {
        return nome;
    }

    public int getDanoAtaque() {
        return danoAtaque;
    }

    public int getArmadura() {
        return armadura;
    }
    
    public abstract void invocarAtaque();
    public abstract void conjurarDefesa();    
}
