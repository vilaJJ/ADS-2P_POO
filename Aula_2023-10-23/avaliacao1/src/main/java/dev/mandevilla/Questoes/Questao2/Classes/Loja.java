package dev.mandevilla.Questoes.Questao2.Classes;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private final List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public String listarProdutos() {
        String retorno = "Apresentando produtos:\n";

        for (Produto produto : produtos) {
            retorno += produto.obterInformacoes() + "\n";
        }

        return retorno;
    }
}
