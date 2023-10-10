package dev.mandevilla.bancomonetario3.Banco.Interfaces;

import dev.mandevilla.bancomonetario3.Banco.Components.Cliente.Cliente;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Conta;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Enums.TipoConta;
import dev.mandevilla.bancomonetario3.Banco.Components.Taxa.Taxas;

public interface IBanco {
    boolean cadastrarCliente(String cpf_cnpj, String nome, String email);
    
    boolean criarConta(Cliente cliente, String numeroConta, TipoConta tipoConta, float valorIncial);

    Cliente obterCliente(String cpf_cnpj, boolean ignorarMensagens);

    Conta obterConta(Cliente cliente, String numeroConta, boolean ignorarMensagens);

    int indiceConta(Cliente cliente, String numeroConta);

    boolean apagarConta(Cliente cliente, String numeroConta);
    
    Taxas obterTaxas();
}
