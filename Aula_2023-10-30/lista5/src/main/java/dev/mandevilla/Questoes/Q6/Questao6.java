package dev.mandevilla.Questoes.Q6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.mandevilla.Questoes.Q6.Classes.Entrevistado;
import dev.mandevilla.Questoes.Q6.Enums.Sexo;

public class Questao6 {
    private final static List<Entrevistado> entrevistados = new ArrayList<Entrevistado>(
        Arrays.asList(
            new Entrevistado(Sexo.Masculino, true),
            new Entrevistado(Sexo.Masculino, true),
            new Entrevistado(Sexo.Feminino, false),
            new Entrevistado(Sexo.Masculino, false),
            new Entrevistado(Sexo.Masculino, false),
            new Entrevistado(Sexo.Feminino, true),
            new Entrevistado(Sexo.Feminino, true),
            new Entrevistado(Sexo.Masculino, false),
            new Entrevistado(Sexo.Feminino, false),
            new Entrevistado(Sexo.Feminino, false)
        )
    );

    public static void executar() {
        // Requisito 1: o número de pessoas que responderam sim;
        int qntdGostaram = 0;

        // Requisito 2: o número de pessoas que responderam não;
        int qntdNaoGostaram = 0;

        // Requisito 3: o número de mulheres que responderam sim;
        int qntdMulheresGostaram = 0;

        // Requisito 4: a percentagem de homens que responderam não, entre todos os homens analisados.
        int qntdHomensNaoGostaram = 0;
        int qntdHomens = 0;

        for (Entrevistado entrevistado : entrevistados) {
            if (entrevistado.isGostou_produto()) {
                qntdGostaram++;
            }

            if (entrevistado.isGostou_produto() == false) {
                qntdNaoGostaram++;
            }

            if (entrevistado.getSexo() == Sexo.Feminino && entrevistado.isGostou_produto()) {
                qntdMulheresGostaram++;
            }

            if (entrevistado.getSexo() == Sexo.Masculino) {
                qntdHomens++;

                if (entrevistado.isGostou_produto() == false) {
                    qntdHomensNaoGostaram++;
                }
            }
        }

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(
            String.format(
                "Quantidade de pessoas que responderam sim: %d",
                qntdGostaram
            )
        );

        System.out.println(
            String.format(
                "\nQuantidade de pessoas que responderam não: %d",
                qntdNaoGostaram
            )
        );

        System.out.println(
            String.format(
                "\nQuantidade de mulheres que responderam sim: %d",
                qntdMulheresGostaram
            )
        );

        double porcentagemHomensNaoGostaram = ((double)qntdHomensNaoGostaram) / ((double)qntdHomens) * 100;
        System.out.println(
            String.format(
                "\nPorcentagem de homens que responderam não, entre todos os homens analisados: %.2f%s",
                porcentagemHomensNaoGostaram,
                '%'
            )
        );

        System.out.println("--------------------------------------------------------------------------------");
    }
}
