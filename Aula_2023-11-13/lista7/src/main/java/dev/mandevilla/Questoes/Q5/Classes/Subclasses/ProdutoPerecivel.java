package dev.mandevilla.Questoes.Q5.Classes.Subclasses;

import java.time.LocalDate;

import dev.mandevilla.Questoes.Q5.Classes.Superclasses.Produto;

public class ProdutoPerecivel extends Produto {
    private final LocalDate dataVencimento;

    public ProdutoPerecivel(String codigo, String nome, double valor, LocalDate dataVencimento) {
        super(codigo, nome, valor);
        this.dataVencimento = dataVencimento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
}
