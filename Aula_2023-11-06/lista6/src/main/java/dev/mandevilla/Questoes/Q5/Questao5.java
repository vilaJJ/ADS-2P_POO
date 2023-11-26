package dev.mandevilla.Questoes.Q5;

import dev.mandevilla.Questoes.Q5.Classes.Subclass.Analista;
import dev.mandevilla.Questoes.Q5.Classes.Subclass.Estagiario;
import dev.mandevilla.Questoes.Q5.Classes.Subclass.Gerente;
import dev.mandevilla.Questoes.Q5.Enums.CargosGerenciais;
import dev.mandevilla.Questoes.Q5.Enums.TipoAnalista;

public class Questao5 {
    private final static Gerente gerente = new Gerente(
        1302, 
        "Bárbara Ohana Santos Silva", 
        14860, 
        CargosGerenciais.Marketing
    );

    private final static Analista analista = new Analista(
        16694, 
        "Juan Felipe Alves Flores", 
        10900, 
        TipoAnalista.Sistema
    );

    private final static Estagiario estagiario = new Estagiario(
        23654, 
        "Maria Eduarda Batista de Souza", 
        980, 
        true
    );

    public static void executar() {
        System.out.println(
            String.format(
                "\nGerente ID. #%d\n\t-> %s\n\t-> Salário: R$ %.2f\n\t-> Gerente de %s",
                gerente.getId(),
                gerente.getNome(),
                gerente.getSalario(),
                gerente.getCargoGerencial().name()
            )
        );

        System.out.println(
            String.format(
                "\nAnalista ID. #%d\n\t-> %s\n\t-> Salário: R$ %.2f\n\t-> Analista de %s",
                analista.getId(),
                analista.getNome(),
                analista.getSalario(),
                analista.getTipoAnalista().name()
            )
        );

        System.out.println(
            String.format(
                "\nEstagiário ID. #%d\n\t-> %s\n\t-> Tipo de estágio: %s\n\t-> Salário: R$ %.2f",
                estagiario.getId(),
                estagiario.getNome(),
                estagiario.isRemunerado() ? "Remunerado" : "Não remunerado",
                estagiario.getSalario()
            )
        );
    }
}
