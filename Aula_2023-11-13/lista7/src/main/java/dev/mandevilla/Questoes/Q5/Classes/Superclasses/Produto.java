package dev.mandevilla.Questoes.Q5.Classes.Superclasses;

public class Produto {
    private final String codigo;
    private String nome;
    private double valor;
    
    public Produto(String codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    //#region Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    //#endregion

    //#region Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    //#endregion
}
