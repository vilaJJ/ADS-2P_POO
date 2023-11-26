package dev.mandevilla.Questoes.Q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.mandevilla.Questoes.Q5.Classes.Pessoa;
import dev.mandevilla.Questoes.Q5.Enums.Cores;

public class Questao5 {
    private final static List<Pessoa> pessoas = new ArrayList<Pessoa>(
        Arrays.asList(
            new Pessoa("Juan Felipe", 19, 1.85f, 83.4f, Cores.Azul, Cores.Preto),
            new Pessoa("Jefferson Ribeiro", 17, 1.79f, 53.5f, Cores.Preto, Cores.Castanho),
            new Pessoa("Valéria Alves", 45, 1.76f, 81.4f, Cores.Castanho, Cores.Ruivo),
            new Pessoa("Antônio Neto", 52, 1.74f, 86.5f, Cores.Castanho, Cores.Loiro),
            new Pessoa("Maria Eduarda", 19, 1.73f, 39.4f, Cores.Castanho, Cores.Preto)
        )
    );
    
    public static void executar() {
        // Requisito 1: a quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg;
        int qntdPessoasReq1 = 0;

        // Requisito 2: a média das idades das pessoas com altura inferior a 1,50 m;
        int somaIdadePessoasReq2 = 0;
        int qntdPessoasSomadasReq2 = 0;

        // Requisito 3: a porcentagem de pessoas com olhos castanhos entre todas as pessoas analisadas;
        int qntdPessoasReq3 = 0;

        // Requisito 4: a quantidade de pessoas ruivas e que não possuem olhos azuis.
        int qntdPessoasReq4 = 0;


        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() > 50 && pessoa.getPeso() < 60) {
                qntdPessoasReq1++;
            }
            
            if (pessoa.getAltura() < 1.5f) {
                somaIdadePessoasReq2 += pessoa.getIdade();
                qntdPessoasSomadasReq2++;
            }

            if (pessoa.getCor_olhos() == Cores.Castanho) {
                qntdPessoasReq3++;
            }

            if (pessoa.getCor_cabelo() == Cores.Ruivo && pessoa.getCor_olhos() != Cores.Azul) {
                qntdPessoasReq4++;
            }
        }

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(
            String.format(
                "\nQuantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: %d",
                qntdPessoasReq1
            )
        );

        System.out.println(
            String.format(
                "\nMédia das idades das pessoas com altura inferior a 1,50 m: %.2fm",
                qntdPessoasSomadasReq2 != 0 ? somaIdadePessoasReq2 / qntdPessoasSomadasReq2 : 0.0f
            )
        );

        double porcentagem = (((double)qntdPessoasReq3) / ((double)pessoas.size())) * 100;
        System.out.println(
            String.format(
                "\nPorcentagem de pessoas com olhos castanhos entre todas as pessoas analisadas: %.2f%s",
                porcentagem,
                '%'
            )
        );

        System.out.println(
            String.format(
                "\nQuantidade de pessoas ruivas e que não possuem olhos azuis: %d",
                qntdPessoasReq4
            )
        );

        System.out.println("--------------------------------------------------------------------------------");
    }
}
