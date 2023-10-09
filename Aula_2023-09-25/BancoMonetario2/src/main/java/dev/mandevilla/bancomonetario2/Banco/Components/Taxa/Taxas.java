package dev.mandevilla.bancomonetario2.Banco.Components.Taxa;

import dev.mandevilla.bancomonetario2.Banco.Components.Taxa.Enums.TiposTaxa;
import dev.mandevilla.bancomonetario2.Banco.Components.Taxa.Interfaces.ITaxas;

public class Taxas implements ITaxas {
    private float saque;

    public Taxas(){
        saque = 5;
    }
    public Taxas(float taxaInicial_saque){
        saque = taxaInicial_saque;
    }

    @Override
    public float obterValorTaxa(TiposTaxa tipoTaxa) {
        float value;

        switch(tipoTaxa){
            case Saque -> {
                value = saque;
            }
            default -> {
                value = 0;
            }
        }

        return value;
    }

    @Override
    public boolean alterarValorTaxa(TiposTaxa tipoTaxa, float value) {
        switch(tipoTaxa){
            case Saque -> {
                saque = value;
            }
            default -> {
                return false;
            }
        }

        return true;
    }
}
