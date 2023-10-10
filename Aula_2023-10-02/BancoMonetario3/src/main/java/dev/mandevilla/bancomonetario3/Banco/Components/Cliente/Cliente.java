package dev.mandevilla.bancomonetario3.Banco.Components.Cliente;

import dev.mandevilla.bancomonetario3.Banco.Components.Cliente.Interfaces.ICliente;
import dev.mandevilla.bancomonetario3.Pessoa.Pessoa;

public class Cliente extends Pessoa implements ICliente {
    
    public Cliente(String cpf_cnpj, String nome, String email){
        super(cpf_cnpj, nome, email);
    }
}
