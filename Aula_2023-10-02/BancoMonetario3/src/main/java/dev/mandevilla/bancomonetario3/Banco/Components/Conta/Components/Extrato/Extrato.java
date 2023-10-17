package dev.mandevilla.bancomonetario3.Banco.Components.Conta.Components.Extrato;

import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Components.Extrato.Interfaces.IExtrato;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Enums.TipoOperacao;

public class Extrato implements IExtrato {
    private final int id;
    private final TipoOperacao tipoOperacao;
    private final float valorOperacao;
    private final float saldo;

    public Extrato(int id, TipoOperacao tipoOperacao, float valorOperacao, float saldo){
        this.id = id;
        this.tipoOperacao = tipoOperacao;
        this.valorOperacao = valorOperacao;
        this.saldo = saldo;
    }

    // Métodos
    @Override
    public String get() {
        var extrato = new StringBuilder();        
        
        var id = String.format("\nExtrato - Identificador #%d\n", this.id);
        var tipoOperacao = String.format("\nOperação: %s", this.tipoOperacao.toString());
        var valorOperacao = String.format("\nValor da operação: R$ %.2f", this.valorOperacao);
        var saldo = String.format("\n\nSaldo após a operação: R$ %.2f", this.saldo);
        var linha_finalizar = "\n----------------------------------------";

        extrato.append(id);
        extrato.append(tipoOperacao);
        extrato.append(valorOperacao);
        extrato.append(saldo);
        extrato.append(linha_finalizar);

        return extrato.toString();
    }
}
