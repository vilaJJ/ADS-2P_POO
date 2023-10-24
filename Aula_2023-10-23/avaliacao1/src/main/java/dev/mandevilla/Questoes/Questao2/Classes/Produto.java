package dev.mandevilla.Questoes.Questao2.Classes;

public class Produto {
    private String nome;
    private float preco;
    private float estoque; // O valor de estoque é float, pois pode ocorrer unidades decimais (kg, gramas, ...)

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
        estoque = 0;
    }

    public Produto(String nome, float preco, float estoque) {
        this.nome = nome;
        this.preco = preco;

        if (estoque < 0) {
            System.out.println("Não é possível ter um estoque menor que zero.\nEstoque inicializado com 0 (zero).");
            estoque = 0;
        }
        else {
            this.estoque = estoque;
        }
    }

    public String obterNome() {
        return nome;
    }
    public float obterPreco() {
        return preco;
    }
    public float obterEstoque() {
        return estoque;
    }

    public void alterarNome(String value) {
        nome = value;
    }
    public void alterarPreco(float value) {
        if (value <= 0) {
            System.out.println("Não é possível alterar o preço do produto igual ou menor que zero.\nProduto modificado para R$ 0,01");
            preco = 0.01f;

            return;
        }

        preco = value;
    }
    public void alterarEstoque(float value) {
        if (value < 0) {
            System.out.println("Não é possível alterar o estoque do produto igual ou menor que zero.\nProduto modificado para 0");
            estoque = 0;

            return;
        }

        estoque = value;
    }

    public String obterInformacoes() {
        String nome = String.format("Nome: %s\n", this.nome);
        String preco = String.format("Preço: R$ %.2f\n", this.preco);
        String estoque = String.format("Estoque: %.3f\n", this.estoque);

        return nome + preco + estoque;
    }
}
