package dev.mandevilla.bancomonetario3.Banco.Components.Taxa.Interfaces;

import dev.mandevilla.bancomonetario3.Banco.Components.Taxa.Enums.TiposTaxa;

public interface ITaxas {
    float getValorTaxa(TiposTaxa tipoTaxa);
    boolean setValorTaxa(TiposTaxa tipoTaxa, float value);    
}
