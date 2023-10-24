package dev.mandevilla.Questoes.Questao4;

import dev.mandevilla.Questoes.Questao4.Classes.Funcionario;

public class Questao4 {
    public static void executar() {
        Funcionario funcionario = new Funcionario("Juan Felipe", 1980);

        System.out.println(funcionario.realizarAumento(50));
        System.out.println(funcionario.calcularImpostoRenda());
    }
}
