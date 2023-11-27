package dev.mandevilla.Questoes.Q6.Classes.Subclasses;

import dev.mandevilla.Questoes.Q6.Classes.Superclasses.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private final double taxaSaque = 5;

    public ContaCorrente(int numeroConta) {
        super(numeroConta);
    }

    public ContaCorrente(int numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void realizarSaque(double value) {
        double saldoAtual = getSaldo();

        if ((value + taxaSaque) > saldoAtual) {
            System.out.println("Operação inválida. Saldo insuficiente.");
            return;
        }

        setSaldo(saldoAtual - (value + taxaSaque));
    }

    @Override
    public void realizarDeposito(double value) {
        double saldoAtual = getSaldo();
        setSaldo(saldoAtual + value);
    }    
}
