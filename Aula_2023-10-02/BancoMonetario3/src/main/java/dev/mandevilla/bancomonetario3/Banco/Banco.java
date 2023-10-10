package dev.mandevilla.bancomonetario3.Banco;

import java.util.ArrayList;
import java.util.List;

import dev.mandevilla.bancomonetario3.Banco.Components.Cliente.Cliente;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Conta;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Enums.TipoConta;
import dev.mandevilla.bancomonetario3.Banco.Components.Taxa.Taxas;
import dev.mandevilla.bancomonetario3.Banco.Interfaces.IBanco;

public class Banco implements IBanco {
    private final List<Cliente> clientes;
    private final List<Conta> contas;
    private final Taxas taxas;
    
    public Banco() {
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
        taxas = new Taxas();
    }
    public Banco(Taxas taxas) {
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
        this.taxas = taxas;
    }

    @Override
    public int indiceConta(Cliente cliente, String numeroConta) {
        var indice = -1;
        for (Conta conta : contas) {
            indice += 1;
            if(conta.getCliente().getCpf_cnpj().equals(cliente.getCpf_cnpj())) {
                if(conta.getNumeroConta().equals(numeroConta)) {
                    return indice;
                }
            }
        }
        return -1;
    }

    @Override
    public Cliente obterCliente(String cpf_cnpj, boolean ignorarMensagens) {
        for (Cliente cliente : clientes) {
            if(cliente.getCpf_cnpj().equals(cpf_cnpj)){
                return cliente;
            }
        }

        if(ignorarMensagens == false) {
            System.out.println("Não foi possível encontrar o cliente desejado.");
        }
        
        return null;
    }

    @Override
    public Conta obterConta(Cliente cliente, String numeroConta, boolean ignorarMensagens) {
        var indice = indiceConta(cliente, numeroConta);

        if(indice < 0) {
            if(ignorarMensagens == false) {
                System.out.println("Não foi possível encontrar a conta. Tente novamente.");
            }
            return null;
        }

        var conta = contas.get(indice);

        if((conta.getCliente().getCpf_cnpj().equals(cliente.getCpf_cnpj())) == false) {
            if(ignorarMensagens == false) {
                System.out.println("Não existe a conta desejada para o cliente desejado.");
            }
            return null;
        }

        return conta;
    }
    
    @Override
    public boolean apagarConta(Cliente cliente, String numeroConta) {
        var indice = indiceConta(cliente, numeroConta);

        if(indice < 0) {
            System.out.println("Não foi possível encontrar a conta. Tente novamente.");
            return false;
        }

        contas.remove(indice);
        return true;
    }

    @Override
    public boolean cadastrarCliente(String cpf_cnpj, String nome, String email) {
        for (Cliente cliente : clientes) {
            if(cliente.getCpf_cnpj() == cpf_cnpj){
                System.out.println("Já existe um cliente com o CPF/CNPJ cadastrado no Banco.");
                return false;
            }
        }

        var cliente = new Cliente(cpf_cnpj, nome, email);
        clientes.add(cliente);

        return true;
    }

    @Override
    public boolean criarConta(Cliente cliente, String numeroConta, TipoConta tipoConta, float valorInicial) {
        for (Conta conta : contas) {
            if(conta.getNumeroConta() == numeroConta) {
                System.out.println("O número de conta já existe.");
                return false;
            }
        }

        Conta conta;
        if(valorInicial <= 0){
            conta = new Conta(this, cliente, numeroConta, tipoConta);
        }
        else{
            conta = new Conta(this, cliente, numeroConta, tipoConta, valorInicial);
        }
        
        contas.add(conta);

        return true;
    }

    @Override
    public Taxas obterTaxas() {
        return taxas;
    }
}
