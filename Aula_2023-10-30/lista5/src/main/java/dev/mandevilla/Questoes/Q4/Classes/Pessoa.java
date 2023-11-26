package dev.mandevilla.Questoes.Q4.Classes;

public class Pessoa {
    private final String nome;
    private final int idade;
    private final float altura;
    private final float peso;

    public Pessoa(String nome, int idade, float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }    
}
