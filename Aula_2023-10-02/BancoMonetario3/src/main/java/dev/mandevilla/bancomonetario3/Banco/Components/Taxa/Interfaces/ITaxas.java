package dev.mandevilla.bancomonetario3.Banco.Components.Taxa.Interfaces;

import dev.mandevilla.bancomonetario3.Banco.Components.Taxa.Enums.TiposTaxa;

public interface ITaxas {
    boolean alterarValorTaxa(TiposTaxa tipoTaxa, float value);

    float obterValorTaxa(TiposTaxa tipoTaxa);
}
