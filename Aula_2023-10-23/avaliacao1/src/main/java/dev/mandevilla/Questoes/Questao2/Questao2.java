package dev.mandevilla.Questoes.Questao2;

import dev.mandevilla.Questoes.Questao2.Classes.Loja;
import dev.mandevilla.Questoes.Questao2.Classes.Produto;

public class Questao2 {
    public static void executar() {
        Loja loja = new Loja();

        Produto produto1 = new Produto("Red Bull Original 269ml", 9.50f, 15);
        Produto produto2 = new Produto("Monster Energetic 450ml", 14.99f);
        Produto produto3 = new Produto("Água Mineral com Gás - La Fonte", 3.19f, 30);

        loja.cadastrarProduto(produto1);
        loja.cadastrarProduto(produto2);
        loja.cadastrarProduto(produto3);

        System.out.println(loja.listarProdutos());
    }
}
