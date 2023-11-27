package dev.mandevilla.Questoes.Q6.Classes.Superclasses;

public abstract class ContaBancaria {
    private final int numeroConta;
    private double saldo;
    
    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        saldo = 0;
    }

    public ContaBancaria(int numeroConta, double valorInicial) {
        this.numeroConta = numeroConta;
        saldo = valorInicial;
    }

    public abstract void realizarSaque(double value);
    public abstract void realizarDeposito(double value);

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }
}
