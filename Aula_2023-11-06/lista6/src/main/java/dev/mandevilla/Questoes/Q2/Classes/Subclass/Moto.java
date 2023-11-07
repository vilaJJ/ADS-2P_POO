package dev.mandevilla.Questoes.Q2.Classes.Subclass;

import dev.mandevilla.Questoes.Q2.Classes.Superclass.Veiculo;

public class Moto extends Veiculo {
    private final int cilindradasMotor;

    public Moto(String marca, String modelo, int cilindradasMotor) {
        super(marca, modelo);
        this.cilindradasMotor = cilindradasMotor;
    }

    public int getCilindradasMotor() {
        return cilindradasMotor;
    }
}
