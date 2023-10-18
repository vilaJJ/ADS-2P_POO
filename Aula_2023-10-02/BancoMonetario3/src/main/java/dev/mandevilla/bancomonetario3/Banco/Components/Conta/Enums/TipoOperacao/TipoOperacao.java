package dev.mandevilla.bancomonetario3.Banco.Components.Conta.Enums.TipoOperacao;

import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Enums.TipoOperacao.Interfaces.ITipoOperacao;

public enum TipoOperacao implements ITipoOperacao {
    Deposito("Depósito"),
    Saque("Saque"),
    TransferenciaRemetente("Transferência - Remetente"),
    TransferenciaDestinatario("Transferência - Destinatário");

    private String name;
    
    TipoOperacao(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
