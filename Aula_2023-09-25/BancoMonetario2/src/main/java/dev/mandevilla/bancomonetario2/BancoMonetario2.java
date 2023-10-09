package dev.mandevilla.bancomonetario2;

import dev.mandevilla.bancomonetario2.Banco.Banco;
import dev.mandevilla.bancomonetario2.Banco.Components.Conta.Enums.TipoConta;

public class BancoMonetario2 {

    public static void main(String[] args) {
        var banco = new Banco();

        banco.cadastrarCliente("564.435.145-87", "Juan Felipe Alves Flores");
        banco.cadastrarCliente("101.287.151-14", "Bárbara Ohana Santos Silva");

        var clienteJuan = banco.obterCliente("564.435.145-87");
        var clienteBarbara = banco.obterCliente("101.287.151-14");

        banco.criarConta(clienteJuan, "1324-6", TipoConta.Corrente, -1);
        banco.criarConta(clienteJuan, "1324-1", TipoConta.Poupanca, 150);
        banco.criarConta(clienteBarbara, "1240-6", TipoConta.Corrente, 200);
        banco.criarConta(clienteBarbara, "1240-1", TipoConta.Poupanca, 100);

        // Corrente
        var contaBarbara_Corrente = banco.obterConta(clienteBarbara, "1240-6");
        var contaJuan_Corrente = banco.obterConta(clienteJuan, "1324-6");

        contaBarbara_Corrente.realizarDeposito(150);
        contaBarbara_Corrente.realizarSaque(100);

        contaJuan_Corrente.realizarDeposito(50);
        contaJuan_Corrente.realizarSaque(100);

        contaBarbara_Corrente.realizarTransferencia(clienteJuan.getCpf_cnpj(), "1324-6", 60);

        System.out.println(contaBarbara_Corrente.obterInformacoesGerais());
        System.out.println(contaBarbara_Corrente.obterExtrato());

        System.out.println(contaJuan_Corrente.obterInformacoesGerais());
        System.out.println(contaJuan_Corrente.obterExtrato());

        // Poupança
        var contaBarbara_Poupanca = banco.obterConta(clienteBarbara, "1240-1");
        var contaJuan_Poupanca = banco.obterConta(clienteJuan, "1324-1");

        contaBarbara_Poupanca.realizarDeposito(450);
        contaBarbara_Poupanca.realizarSaque(300);

        contaJuan_Poupanca.realizarDeposito(250);
        contaJuan_Poupanca.realizarSaque(50);

        contaBarbara_Poupanca.realizarTransferencia(clienteJuan.getCpf_cnpj(), "1324-1", 60);

        System.out.println(contaBarbara_Poupanca.obterInformacoesGerais());
        System.out.println(contaBarbara_Poupanca.obterExtrato());

        System.out.println(contaJuan_Poupanca.obterInformacoesGerais());
        System.out.println(contaJuan_Poupanca.obterExtrato());
    }
}
