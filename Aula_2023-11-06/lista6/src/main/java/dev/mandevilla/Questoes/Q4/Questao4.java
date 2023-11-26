package dev.mandevilla.Questoes.Q4;

import dev.mandevilla.Questoes.Q4.Classes.Subclass.Aluno;

public class Questao4 {
    private static final Aluno aluno = new Aluno("Juan Felipe Alves Flores", 19, "202314110039");

    public static void executar() {
        System.out.println("Informações do aluno:");

        System.out.println(
            String.format(
                "\t-> Matrícula: #%s",
                aluno.getMatricula()
            )
        );

        System.out.println(
            String.format(
                "\t-> Nome: %s",
                aluno.getNome()
            )
        );

        System.out.println(
            String.format(
                "\t-> Idade: %d anos",
                aluno.getIdade()
            )
        );
    }
}
