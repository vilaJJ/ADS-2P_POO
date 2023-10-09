package dev.mandevilla.bancomonetario2.Banco.Components.Cliente;

import dev.mandevilla.bancomonetario2.Banco.Components.Cliente.Interfaces.ICliente;
import dev.mandevilla.bancomonetario2.Pessoa.Pessoa;

public class Cliente extends Pessoa implements ICliente {
    
    public Cliente(String cpf_cnpj, String nome){
        super(cpf_cnpj, nome);
    }
}
