package dev.mandevilla.Questoes.Questao1.Classes;

public class Emprestimo {
    private boolean devolvido;
    private final int codigoUsuario;
    private final int codigoLivro;
    private final int qntdCopias;

    public Emprestimo(int codigoUsuario, int codigoLivro, int qntdCopias) {
        devolvido = false;

        this.codigoUsuario = codigoUsuario;
        this.codigoLivro = codigoLivro;
        this.qntdCopias = qntdCopias;
    }

    public boolean isDevolvido() {
        return devolvido;
    }
    public int getCodigoUsuario() {
        return codigoUsuario;
    }
    public int getCodigoLivro() {
        return codigoLivro;
    }
    public int getQntdCopias() {
        return qntdCopias;
    }

    public void realizarDevolucao() {
        devolvido = true;
    }
}
