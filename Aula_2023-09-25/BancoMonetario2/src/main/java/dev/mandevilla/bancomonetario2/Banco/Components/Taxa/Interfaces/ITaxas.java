package dev.mandevilla.bancomonetario2.Banco.Components.Taxa.Interfaces;

import dev.mandevilla.bancomonetario2.Banco.Components.Taxa.Enums.TiposTaxa;

public interface ITaxas {
    boolean alterarValorTaxa(TiposTaxa tipoTaxa, float value);

    float obterValorTaxa(TiposTaxa tipoTaxa);
}
