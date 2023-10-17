package dev.mandevilla.bancomonetario3.Banco.Components.AutoAtendimento;

import java.util.Scanner;

import dev.mandevilla.bancomonetario3.Banco.Banco;
import dev.mandevilla.bancomonetario3.Banco.Components.AutoAtendimento.Interfaces.IAutoAtendimento;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Conta;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Enums.TipoConta;

public class AutoAtendimento implements IAutoAtendimento {
    private final Banco banco;
    private Conta conta;
    private final Scanner scanner;
    private final String barras;
    
    public AutoAtendimento(Banco banco) {
        this.banco = banco;
        scanner = new Scanner(System.in);

        barras = "------------------------------------------------------------------------------";
    }
       
    @Override
    public void startAutoAtendimento() {
        System.out.println("Olá, seja bem-vindo ao Mybank!\n\nEscolha uma opção:\n");
        menuInicial();
    }

    private void menuInicial() {
        var continuarOperacao = true;
        var opcoes = new StringBuilder();

        opcoes.append("1 -> Acessar conta\n");
        opcoes.append("2 -> Criar conta\n");
        opcoes.append("3 -> Criar cliente\n");
        opcoes.append("0 -> Encerrar atendimento\n");
        opcoes.append("Digite a opção: ");

        while(continuarOperacao) {
            System.out.print(opcoes.toString());
            var opcao = scanner.next();

            switch(opcao) {
                case "0" -> {
                    continuarOperacao = false;
                    System.out.println("\nAtendimento encerrado.");
                    break;
                }
                case "1" -> {
                    acessarConta();
                }
                case "2" -> {
                    criarConta();
                }
                case "3" -> {
                    criarCliente();
                }
                default -> {
                    System.out.println("Selecione uma opção válida!\n");
                }
            }
        }
    }

    private void acessarConta() {
        System.out.println("\nAcessando cliente:");
        
        System.out.print("\t-> Insira o seu CPF/CNPJ: ");
        scanner.nextLine(); // consumir \n
        var cpf_cnpj = scanner.next();

        var cliente = banco.getCliente(cpf_cnpj, false);

        if(cliente == null) {
            System.out.println("Acesso de conta encerrado.\n");
            return;
        }

        System.out.print("\t-> Insira o número da conta: ");
        scanner.nextLine(); // consumir \n
        var numeroConta = scanner.nextLine();

        var conta = banco.getConta(cliente, numeroConta, false);
        if(conta == null) {
            System.out.println("Acesso de conta encerrada.\n");
            return;
        }
        this.conta = conta;
        
        System.out.println("\nAcesso realizado com sucesso!");
        System.out.println(
            String.format(
                "\nOlá, cliente %s! Selecione uma opção abaixo:\n",
                conta.getCliente().getNome()
            )
        );

        var continuarOperacao = true;
        var opcoes = new StringBuilder();

        opcoes.append("1 -> Exibir informações gerais\n");
        opcoes.append("2 -> Exibir extrato\n"); 
        opcoes.append("3 -> Realizar depósito\n");
        opcoes.append("4 -> Realizar saque\n");
        opcoes.append("5 -> Realizar transferência\n");  
        opcoes.append("0 -> Encerrar atendimento\n");
        opcoes.append("Digite a opção: ");

        while(continuarOperacao) {
            System.out.print(opcoes.toString());
            var opcao = scanner.next();

            switch(opcao) {
                case "0" -> {
                    continuarOperacao = false;
                    System.out.println("\nAtendimento de conta encerrado.");
                    break;
                }
                case "1" -> {
                    exibirInformacoesGerais();
                }
                case "2" -> {
                    exibirExtrato();
                }
                case "3" -> {
                    realizarDeposito();
                }
                case "4" -> {
                    realizarSaque();
                }
                case "5" -> {
                    realizarTransferencia();
                }
                default -> {
                    System.out.println("Selecione uma opção válida!\n");
                }
            }
        }
    }

    private void criarConta() {
        System.out.println("\nAcessando cliente:");
        
        System.out.print("\t-> Insira o seu CPF/CNPJ: ");
        scanner.nextLine(); // consumir \n
        var cpf_cnpj = scanner.next();

        var cliente = banco.getCliente(cpf_cnpj, false);
        if(cliente == null) {
            System.out.println("\nCriação encerrada.\n");
            return;
        }

        System.out.print("\t-> Insira o número da conta: ");
        scanner.nextLine(); // consumir \n
        var numeroConta = scanner.nextLine();

        var conta = banco.getConta(cliente, numeroConta, true);
        if(conta != null) {
            System.out.println("\nJá existe uma conta criada para o cliente selecionado.\nCriação encerrada.\n");
            return;
        }

        System.out.println("\t-> Insira o tipo da conta:");
        System.out.println("\t\t1 -> Corrente");
        System.out.println("\t\t2 -> Poupança");
        System.out.print("\tDigite: ");
        var tipoContaStr = scanner.next();

        TipoConta tipoConta;
        switch(tipoContaStr) {
            case "1" -> {
                tipoConta = TipoConta.Corrente;
                break;
            }
            case "2" -> {
                tipoConta = TipoConta.Poupanca;
                break;
            }
            default -> {
                System.out.println("Valor de tipo de poupança inválido.\nCriação encerrada.");
                return;
            }
        }

        System.out.print("\t-> Insira um valor inicial (0 ou menor que zero para iniciar sem valor): R$ ");
        var valorInicial = scanner.nextFloat();
        
        banco.addConta(cliente, numeroConta, tipoConta, valorInicial);

        System.out.println("\nConta criada com sucesso!");
    }

    private void criarCliente() {
        System.out.println("\n" + barras);
        System.out.println("Realizando cadastro do cliente:");

        System.out.print("\t-> Insira seu CPF/CNPJ: ");
        scanner.nextLine(); // consumir \n
        var cpf_cnpj = scanner.nextLine();

        var cliente = banco.getCliente(cpf_cnpj, true);
        if(cliente != null) {
            System.out.println("\nJá existe um cliente com esse CPF/CNPJ cadastrado.\nCadastro encerrado.");
            return;
        }

        System.out.print("\t-> Insira seu nome: ");
        var nome = scanner.nextLine();

        if(nome.isBlank()) {
            System.out.println("\nNão é possível inserir um nome em branco.\nCadastro encerrado.");
            return;
        }
        if(nome.isEmpty()) {
            System.out.println("\nNão é possível inserir um nome vazio.\nCadastro encerrado.");
            return;
        }

        System.out.print("\t-> Insira seu email: ");
        var email = scanner.nextLine();

        if(email.isBlank()) {
            System.out.println("\nNão é possível inserir um email em branco.\nCadastro encerrado.");
            return;
        }
        if(email.isEmpty()) {
            System.out.println("\nNão é possível inserir um email vazio.\nCadastro encerrado.");
            return;
        }

        banco.addCliente(cpf_cnpj, nome, email);
        
        System.out.println(barras + "\n");
        System.out.println("Cliente cadastrado com sucesso!\n");
    }

    private void realizarDeposito() {
        System.out.print("\t-> Insira o valor que deseja realizar o depósito: R$ ");
        var value = scanner.nextFloat();

        var retorno = conta.setDeposito(value) ? "\t-> Depósito realizado com sucesso.\n" : "Erro ao realizar depósito.\n";
        System.out.println(retorno);
    }

    private void realizarSaque() {
        System.out.print("\t-> Insira o valor que deseja realizar o saque: R$ ");
        var value = scanner.nextFloat();

        var retorno = conta.setSaque(value) ? "\t-> Saque realizado com sucesso.\n" : "Erro ao realizar saque.\n";
        System.out.println(retorno);
    }

    private void realizarTransferencia() {
        // TODO: Autogenerated method stub
        System.out.print("Insira o CPF/CNPJ do proprietário: ");
        scanner.nextLine(); // consumir \n
        var cpf_cnpj_proprietario = scanner.nextLine();

        System.out.print("Insira o número da conta do proprietário: ");
        var numeroConta = scanner.nextLine();

        System.out.print("Insira o valor a ser transferido: R$ ");
        var value = scanner.nextFloat();

        var retorno = 
            conta.setTransferencia(cpf_cnpj_proprietario, numeroConta, value)
            ? "\t-> Transferência realizada com sucesso.\n"
            : "Erro ao realizar transferência.\n";
        System.out.println(retorno);
    }

    private void exibirExtrato() {
        var extrato = conta.getExtrato();

        System.out.println("\nExibindo extratos:");
        System.out.println(extrato);
    }

    private void exibirInformacoesGerais() {
        var infoGerais = conta.getInformacoesGerais();
        System.out.println(infoGerais);
    }
}