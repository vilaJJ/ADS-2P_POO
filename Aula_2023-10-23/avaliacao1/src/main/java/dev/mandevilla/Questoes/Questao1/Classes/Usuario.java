package dev.mandevilla.Questoes.Questao1.Classes;

public class Usuario {
    private final int codigo;
    private String nome;

    public Usuario(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
