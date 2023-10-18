package dev.mandevilla.bancomonetario3.Banco.Interfaces;

import dev.mandevilla.bancomonetario3.Banco.Components.Cliente.Cliente;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Conta;
import dev.mandevilla.bancomonetario3.Banco.Components.Conta.Enums.TipoConta.TipoConta;
import dev.mandevilla.bancomonetario3.Banco.Components.Taxa.Taxas;

public interface IBanco {
    boolean addCliente(String cpf_cnpj, String nome, String email);
    Cliente getCliente(String cpf_cnpj, boolean ignorarMensagens);

    boolean addConta(Cliente cliente, String numeroConta, TipoConta tipoConta, float valorIncial);    
    Conta getConta(Cliente cliente, String numeroConta, boolean ignorarMensagens);
    int getIndiceConta(Cliente cliente, String numeroConta);
    boolean deleteConta(Cliente cliente, String numeroConta);
    
    Taxas getTaxas();
}
