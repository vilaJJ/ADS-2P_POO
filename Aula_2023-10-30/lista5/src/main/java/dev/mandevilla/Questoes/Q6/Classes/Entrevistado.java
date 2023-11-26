package dev.mandevilla.Questoes.Q6.Classes;

import dev.mandevilla.Questoes.Q6.Enums.Sexo;

public class Entrevistado {
    private final Sexo sexo;
    private final boolean gostou_produto;
    
    public Entrevistado(Sexo sexo, boolean gostou_produto) {
        this.sexo = sexo;
        this.gostou_produto = gostou_produto;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public boolean isGostou_produto() {
        return gostou_produto;
    }
}
