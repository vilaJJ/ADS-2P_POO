package dev.mandevilla.bancomonetario2.Banco.Interfaces;

import dev.mandevilla.bancomonetario2.Banco.Components.Cliente.Cliente;
import dev.mandevilla.bancomonetario2.Banco.Components.Taxa.Taxas;
import dev.mandevilla.bancomonetario2.Banco.Components.Conta.Conta;
import dev.mandevilla.bancomonetario2.Banco.Components.Conta.Enums.TipoConta;

public interface IBanco {
    boolean cadastrarCliente(String cpf_cnpj, String nome);
    
    boolean criarConta(Cliente cliente, String numeroConta, TipoConta tipoConta, float valorIncial);

    Cliente obterCliente(String cpf_cnpj);

    Conta obterConta(Cliente cliente, String numeroConta);

    int indiceConta(Cliente cliente, String numeroConta);

    boolean apagarConta(Cliente cliente, String numeroConta);
    
    Taxas obterTaxas();
}
