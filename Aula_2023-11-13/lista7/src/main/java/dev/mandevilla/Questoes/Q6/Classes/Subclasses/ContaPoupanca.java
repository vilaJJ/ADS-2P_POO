package dev.mandevilla.Questoes.Q6.Classes.Subclasses;

import dev.mandevilla.Questoes.Q6.Classes.Superclasses.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(int numeroConta) {
        super(numeroConta);
    }

    public ContaPoupanca(int numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void realizarSaque(double value) {
        double saldoAtual = getSaldo();

        if (value > saldoAtual) {
            System.out.println("Operação inválida. Saldo insuficiente.");
            return;
        }

        setSaldo(saldoAtual - value);
    }

    @Override
    public void realizarDeposito(double value) {
        double saldoAtual = getSaldo();
        setSaldo(saldoAtual + value);
    }    
}
