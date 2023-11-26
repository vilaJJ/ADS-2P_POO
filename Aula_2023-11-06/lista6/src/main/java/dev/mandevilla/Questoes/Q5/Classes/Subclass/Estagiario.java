package dev.mandevilla.Questoes.Q5.Classes.Subclass;

import dev.mandevilla.Questoes.Q5.Classes.Superclass.Funcionario;

public class Estagiario extends Funcionario {
    private final boolean remunerado;

    public Estagiario(int id, String nome, double salario, boolean remunerado) {
        super(id, nome, salario);
        this.remunerado = remunerado;
    }

    public boolean isRemunerado() {
        return remunerado;
    }
}
