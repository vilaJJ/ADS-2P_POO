package dev.mandevilla.Questoes.Q6;

import dev.mandevilla.Questoes.Q6.Classes.Subclasses.ContaCorrente;
import dev.mandevilla.Questoes.Q6.Classes.Subclasses.ContaPoupanca;

public class Questao6 {
    private static final ContaPoupanca contaPoupanca = new ContaPoupanca(14365, 100);
    private static final ContaCorrente contaCorrente = new ContaCorrente(26984);

    public static void executar() {
        contaPoupanca.realizarDeposito(50);
        contaPoupanca.realizarSaque(75);

        contaCorrente.realizarDeposito(150);
        contaCorrente.realizarSaque(80);

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Conta Poupança:");
        
        System.out.println(
            String.format(
                "\t-> Número #%d\n\t-> Saldo atual: R$ %.2f",
                contaPoupanca.getNumeroConta(),
                contaPoupanca.getSaldo()
            )
        );

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Conta Corrente:");
        
        System.out.println(
            String.format(
                "\t-> Número #%d\n\t-> Saldo atual: R$ %.2f",
                contaCorrente.getNumeroConta(),
                contaCorrente.getSaldo()
            )
        );
    }
}
