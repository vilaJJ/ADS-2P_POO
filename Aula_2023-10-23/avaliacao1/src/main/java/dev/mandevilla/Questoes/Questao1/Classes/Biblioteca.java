package dev.mandevilla.Questoes.Questao1.Classes;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Usuario> usuarios;
    private final  List<Livro> livros;
    private final List<Emprestimo> emprestimos;

    public Biblioteca() {
        usuarios = new ArrayList<>();
        livros = new ArrayList<>();
        emprestimos = new ArrayList<>();
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }
    public void cadastrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void emprestarLivro(int index, int qntd) {
        livros.get(index).emprestarLivro(qntd);
    }
    public void devolverLivro(int index, int qntd) {
        livros.get(index).devolverLivro(qntd);
    }

    public String obterUsuarios() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Apresentando usuários:\n\n");

        for (Usuario usuario : usuarios) {
            retorno.append(String.format("#%d %s\n", usuario.getCodigo(), usuario.getNome()));
        }

        return retorno.toString();
    }

    public String obterLivros() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Apresentando livros:\n\n");

        for (Livro livro : livros) {
            String copias = livro.getNumeroCopiasDisponiveis() == 1 ? "cópia disponível" : "cópias disponíveis";
            retorno.append(String.format(
                "%s (%s) -> %d %s\n", 
                livro.getTitulo(), livro.getAutor(), livro.getNumeroCopiasDisponiveis(), copias
            ));
        }

        return retorno.toString();
    }

    public String obterEmprestimos() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Apresentando empréstimos:\n\n");

        for (Emprestimo emprestimo : emprestimos) {
            String devolvido = emprestimo.isDevolvido() ? "Não devolvido" : "Devolvido";
            String copias = emprestimo.getQntdCopias() == 1 ? "cópia" : "cópias";
            retorno.append(String.format("%s -> Código %d (%d %s) -> Código Usuário #%d\n", 
                devolvido, emprestimo.getCodigoLivro(), emprestimo.getQntdCopias(), copias, emprestimo.getCodigoUsuario()
            ));
        }

        return retorno.toString();
    }
}
