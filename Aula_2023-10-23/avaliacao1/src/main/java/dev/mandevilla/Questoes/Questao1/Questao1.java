package dev.mandevilla.Questoes.Questao1;

import dev.mandevilla.Questoes.Questao1.Classes.Biblioteca;
import dev.mandevilla.Questoes.Questao1.Classes.Emprestimo;
import dev.mandevilla.Questoes.Questao1.Classes.Livro;
import dev.mandevilla.Questoes.Questao1.Classes.Usuario;

public class Questao1 {
    public static void executar() {
        // Criando Biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criando Livros
        Livro livro1 = new Livro(1, "Task Manager", "C. J. Tudor", 10);
        biblioteca.cadastrarLivro(livro1);

        // Criando Usuarios
        Usuario usuario1 = new Usuario(1, "Juan Felipe");
        Usuario usuario2 = new Usuario(2, "Bárbara Ohana");
        biblioteca.cadastrarUsuario(usuario1);
        biblioteca.cadastrarUsuario(usuario2);

        // Criando Emprestimos
        Emprestimo emprestimo1 = new Emprestimo(1, 1, 2);
        biblioteca.emprestarLivro(0, 2);
        Emprestimo emprestimo2 = new Emprestimo(2, 1, 3);
        biblioteca.emprestarLivro(0, 3);
        biblioteca.cadastrarEmprestimo(emprestimo1);
        biblioteca.cadastrarEmprestimo(emprestimo2);

        System.out.println(biblioteca.obterUsuarios());
        System.out.println(biblioteca.obterLivros());
        System.out.println(biblioteca.obterEmprestimos());
    }
}
