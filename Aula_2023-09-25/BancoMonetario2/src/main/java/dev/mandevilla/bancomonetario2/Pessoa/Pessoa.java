package dev.mandevilla.bancomonetario2.Pessoa;

import dev.mandevilla.bancomonetario2.Pessoa.Interfaces.IPessoa;

public class Pessoa implements IPessoa {
    private final String cpf_cnpj;
    private String nome;
    
    public Pessoa(String cpf_cnpj, String nome){
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
    }

    // cpf_cnpj
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }
    
    // nome
    public String getNome() {
        return nome;
    }
    
    // Métodos

    @Override
    public void modificarNome(String value) {
        this.nome = value;
    }
}