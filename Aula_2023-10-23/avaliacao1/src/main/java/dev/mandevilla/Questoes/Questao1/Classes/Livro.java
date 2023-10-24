package dev.mandevilla.Questoes.Questao1.Classes;

public class Livro {
    private final int codigoLivro;
    private final String titulo;
    private final String autor;
    private int numeroCopiasDisponiveis;

    public Livro(int codigoLivro, String titulo, String autor, int numeroCopias) {
        this.codigoLivro = codigoLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroCopiasDisponiveis = numeroCopias;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getNumeroCopiasDisponiveis() {
        return numeroCopiasDisponiveis;
    }

    public void emprestarLivro(int qntdCopias) {
        if (qntdCopias > numeroCopiasDisponiveis) {
            System.out.println("Não é possível realizar o empréstimo. Não há unidades disponíveis.");
            return;
        }

        numeroCopiasDisponiveis -= qntdCopias;
    }

    public void devolverLivro(int qntdCopias) {
        numeroCopiasDisponiveis += qntdCopias;
    }
}
