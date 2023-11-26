package dev.mandevilla.Questoes.Q5.Classes;

import dev.mandevilla.Questoes.Q5.Enums.Cores;

public class Pessoa {
    private final String nome;
    private final int idade;
    private final float peso;
    private final float altura;
    private final Cores cor_olhos;
    private final Cores cor_cabelo;
    
    public Pessoa(String nome, int idade, float peso, float altura, Cores cor_olhos, Cores cor_cabelo) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.cor_olhos = cor_olhos;
        this.cor_cabelo = cor_cabelo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public Cores getCor_olhos() {
        return cor_olhos;
    }

    public Cores getCor_cabelo() {
        return cor_cabelo;
    }
}
