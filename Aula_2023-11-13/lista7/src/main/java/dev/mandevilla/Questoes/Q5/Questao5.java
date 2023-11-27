package dev.mandevilla.Questoes.Q5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dev.mandevilla.Questoes.Q5.Classes.Subclasses.ProdutoPerecivel;
import dev.mandevilla.Questoes.Q5.Classes.Superclasses.Produto;

public class Questao5 {
    private static final Produto produtoNormal = new Produto(
        "7896020470120", 
        "Three Bond Cola Multiuso", 
        4.79
    );

    private static final ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(
        "7896020160052", 
        "Baruel Tenys Pé - Desodorante para os pés", 
        9.99,
        LocalDate.of(2026, 05, 01)
    );

    public static void executar() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Produto Normal:");

        System.out.println(
            String.format(
                "\t-> %s (%s)\n\t-> R$ %.2f",
                produtoNormal.getNome(),
                produtoNormal.getCodigo(),
                produtoNormal.getValor()
            )
        );

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Produto Perecível:");

        System.out.println(
            String.format(
                "\t-> %s (%s)\n\t-> R$ %.2f\n\t-> Data de vencimento: %s",
                produtoPerecivel.getNome(),
                produtoPerecivel.getCodigo(),
                produtoPerecivel.getValor(),
                produtoPerecivel.getDataVencimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            )
        );
    }
}
