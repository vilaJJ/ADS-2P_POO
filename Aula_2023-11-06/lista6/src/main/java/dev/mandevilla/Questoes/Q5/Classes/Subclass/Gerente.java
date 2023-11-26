package dev.mandevilla.Questoes.Q5.Classes.Subclass;

import dev.mandevilla.Questoes.Q5.Classes.Superclass.Funcionario;
import dev.mandevilla.Questoes.Q5.Enums.CargosGerenciais;

public class Gerente extends Funcionario {
    private final CargosGerenciais cargoGerencial;

    public Gerente(int id, String nome, double salario, CargosGerenciais cargoGerencial) {
        super(id, nome, salario);
        this.cargoGerencial = cargoGerencial;
    }

    public CargosGerenciais getCargoGerencial() {
        return cargoGerencial;
    }
}
