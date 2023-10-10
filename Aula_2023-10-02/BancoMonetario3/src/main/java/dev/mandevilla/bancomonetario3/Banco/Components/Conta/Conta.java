package dev.mandevilla.bancomonetario3.Banco.Components.Conta;

import java.util.ArrayList;
import java.util.List;

import dev.mandevilla.bancomonetario3.Banco.Banco;
import dev.mandevilla.bancomonetario3.Banco.Components.Cliente.Cliente;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Components.Extrato.Extrato;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Enums.TipoConta;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Enums.TipoOperacao;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Interfaces.IConta;
import dev.mandevilla.bancomonetario3.Banco.Components.Taxa.Enums.TiposTaxa;

public class Conta implements IConta {
    private final Banco banco;
    private final Cliente cliente;
    private final String numeroConta;
    private final TipoConta tipoConta;
    private final List<Extrato> extratos;
    private float saldo;

    public Conta(Banco banco, Cliente cliente, String numeroConta, TipoConta tipoConta) {
        this.banco = banco;
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;

        extratos = new ArrayList<>();
        saldo = 0;
    }

    public Conta(Banco banco, Cliente cliente, String numeroConta, TipoConta tipoConta, float saldoInicial){
        this.banco = banco;
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        
        extratos = new ArrayList<>();
        saldo = saldoInicial;

        var id_operacao = extratos.size() + 1;
        var extrato = new Extrato(id_operacao, TipoOperacao.Deposito, saldoInicial, saldo);
        extratos.add(extrato);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    // Métodos
    @Override
    public String obterSaldo() {
        var saldo = String.format("Saldo atual: R$ %.2f", this.saldo);
        return saldo;
    }
    
    @Override
    public String obterInformacoesGerais() {
        var infoGerais = new StringBuilder();
        
        var nomeProprietario = String.format("Nome do proprietário: %s\n", this.cliente.getNome());
        var cpf_cnpjProprietario = String.format("CPF/CNPJ do proprietário: %s\n\n", this.cliente.getCpf_cnpj());
        var numeroConta = String.format("Número da conta: %s\n", this.numeroConta);
        var tipoConta = String.format("Tipo de conta: %s\n", this.tipoConta.name());
        var situacaoConta = String.format("Situação da conta: %s\n\n", saldo < 0 ? "Em cheque especial" : "Normal");
        var saldo = String.format("Saldo: R$ %.2f", this.saldo);

        infoGerais.append("\n--------------------------------------------------\n");

        infoGerais.append("Informações gerais da conta:\n\n");

        infoGerais.append(nomeProprietario);
        infoGerais.append(cpf_cnpjProprietario);
        infoGerais.append(numeroConta);
        infoGerais.append(tipoConta);
        infoGerais.append(situacaoConta);
        infoGerais.append(saldo);

        infoGerais.append("\n--------------------------------------------------\n");

        return infoGerais.toString();
    }

    @Override
    public String obterExtrato() {
        var extratos = new StringBuilder();
        
        for (var extrato : this.extratos) {
            extratos.append(extrato.obter());
        }

        return extratos.toString();
    }

    @Override
    public boolean realizarTransferencia(String cpf_cnpj_destinatario, String numeroConta_destinatario, float value) {
        var clienteDestinatario = banco.obterCliente(cpf_cnpj_destinatario, false);
        var contaDestinatario = banco.obterConta(clienteDestinatario, numeroConta_destinatario, false);

        if(contaDestinatario == null) {
            System.out.println("Transferência cancelada. Conta de destino inexistente.");
            return false;
        }
        if(tipoConta == TipoConta.Poupanca) {
            System.out.println("Não é possível realizar a transferência. A conta do remetente é Poupança.");
            return false;
        }
        if(contaDestinatario.tipoConta == TipoConta.Poupanca) {
            System.out.println("Não é possível realizar a transferência. A conta do destinatário é Poupança.");
            return false;
        }
        if(value <= 0) {
            System.out.println("Não é possível realizar transferência de valores menores ou igual a zero.");
            return false;
        }
        if(saldo < 0) {
            System.out.println("Não é possível realizar a transferência, a conta do remetente está em Cheque Especial.");
            return false;
        }

        saldo -= value;
        
        var id_operacaoRem = extratos.size() + 1;
        var extratoRem = new Extrato(id_operacaoRem, TipoOperacao.TransferenciaRemetente, value, saldo);
        extratos.add(extratoRem);

        contaDestinatario.saldo += value;

        var id_operacaoDest = extratos.size() + 1;
        var extratoDest = new Extrato(id_operacaoDest, TipoOperacao.TransferenciaDestinatario, value, contaDestinatario.saldo);
        contaDestinatario.extratos.add(extratoDest);

        return true;
    }

    @Override
    public boolean realizarDeposito(float value) {
        if(value <= 0) {
            System.out.println("Não é possível realizar um depósito de valor negativo. Tente novamente.");
            return false;
        }

        saldo += value;

        var id_operacao = extratos.size() + 1;
        var extrato = new Extrato(id_operacao, TipoOperacao.Deposito, value, saldo);
        extratos.add(extrato);

        return true;
    }

    @Override
    public boolean realizarSaque(float value) {
        if(value <= 0) {
            System.out.println("Não é possível realizar um saque de valor negativo. Tente novamente.");
            return false;
        }
        else if (saldo < 0) {
            System.out.println("Não foi possível realizar o saque. Conta em Cheque Especial.");
            return false;
        }

        var taxasBanco = banco.obterTaxas();
        var taxaSaque = taxasBanco.obterValorTaxa(TiposTaxa.Saque);

        value += taxaSaque;
        saldo -= value + taxaSaque;

        var id_operacao = extratos.size() + 1;
        var extrato = new Extrato(id_operacao, TipoOperacao.Saque, value, saldo);
        extratos.add(extrato);

        return true;
    }
}