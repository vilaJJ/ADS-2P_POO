package dev.mandevilla.Questoes.Questao3;

import dev.mandevilla.Questoes.Questao3.Classes.Agenda;
import dev.mandevilla.Questoes.Questao3.Classes.Contato;

public class Questao3 {
    public static void executar() {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato(
            "Juan Felipe Alves Flores", 
            "+55 (63) 99246-1561", 
            "juan.flores@gmail.com"
        );
        Contato contato2 = new Contato(
            "Maria Eduarda Batista de Souza", 
            "+55 (63) 99201-8210", 
            "maria.souza@gmail.com"
        );
        Contato contato3 = new Contato(
            "Beatriz Coelho dos Santos", 
            "+55 (63) 99121-1587", 
            "beatriz.santos@gmail.com"
        );
        Contato contato4 = new Contato(
            "Bárbara Ohana Santos Silva", 
            "+55 (63) 93164-2354", 
            "barbara.silva@gmail.com"
        );

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);
        agenda.adicionarContato(contato4);

        agenda.excluirContato("beatriz.santos@gmail.com");

        System.out.println(agenda.listarContatos());
    }
}
