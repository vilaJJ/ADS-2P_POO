package dev.mandevilla.Questoes.Q8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.mandevilla.Questoes.Q8.Classes.Pessoa;

public class Questao8 {
    private final static List<Pessoa> pessoas = new ArrayList<Pessoa>(
        Arrays.asList(
            new Pessoa("Juan Felipe", 19, 1.85f, 83.4f),
            new Pessoa("Jefferson Ribeiro", 17, 1.79f, 53.5f),
            new Pessoa("Valéria Alves", 45, 1.76f, 81.4f),
            new Pessoa("Antônio Neto", 52, 1.74f, 86.5f),
            new Pessoa("Maria Eduarda", 19, 1.73f, 39.4f)
        )
    );

    public static void executar() {
        int qntdPessoasIdade50Minor = 0;
        
        float mediaAltura = 0;
        int qntdMediaAltura = 0;

        int qntdPessoasPeso40Minor = 0;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 50) {
                qntdPessoasIdade50Minor++;
            }

            if (pessoa.getIdade() >= 10 && pessoa.getIdade() <= 20) {
                mediaAltura += pessoa.getAltura();
                qntdMediaAltura++;
            }

            if (pessoa.getPeso() < 40) {
                qntdPessoasPeso40Minor++;
            }
        }

        System.out.println("\n--------------------------------------------------------------------------------");

        System.out.println(
            String.format(
                "Quantidade de pessoas com menos de 50 anos: %d",
                qntdPessoasIdade50Minor
            )
        );

        System.out.println(
            String.format(
                "\nMédia da altura de pessoas entre 10 à 20 anos: %.2fm",
                mediaAltura / qntdMediaAltura
            )
        );

        double porcentagem = (((double)qntdPessoasPeso40Minor) / ((double)pessoas.size())) * 100;
        System.out.println(
            String.format(
                "\nPorcentagem das pessoas com menos de 40kg de peso: %.2f%s",
                porcentagem,
                '%'
            )
        );

        System.out.println("--------------------------------------------------------------------------------");
    }
}
