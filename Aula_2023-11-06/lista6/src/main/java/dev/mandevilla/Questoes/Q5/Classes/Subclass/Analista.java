package dev.mandevilla.Questoes.Q5.Classes.Subclass;

import dev.mandevilla.Questoes.Q5.Classes.Superclass.Funcionario;
import dev.mandevilla.Questoes.Q5.Enums.TipoAnalista;

public class Analista extends Funcionario {
    private final TipoAnalista tipoAnalista;

    public Analista(int id, String nome, double salario, TipoAnalista tipoAnalista) {
        super(id, nome, salario);
        this.tipoAnalista = tipoAnalista;
    }

    public TipoAnalista getTipoAnalista() {
        return tipoAnalista;
    }
}
