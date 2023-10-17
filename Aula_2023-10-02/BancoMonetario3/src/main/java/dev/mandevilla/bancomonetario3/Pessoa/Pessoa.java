package dev.mandevilla.bancomonetario3.Pessoa;

import dev.mandevilla.bancomonetario3.Pessoa.Interfaces.IPessoa;

public class Pessoa implements IPessoa {
    private final String cpf_cnpj;
    private String nome;
    private String email;
    
    public Pessoa(String cpf_cnpj, String nome, String email){
        this.cpf_cnpj = cpf_cnpj;
        this.nome = nome;
        this.email = email;
    }

    // cpf_cnpj
    public String getCpf_cnpj() {
        return cpf_cnpj;
    }
    
    // nome
    public String getNome() {
        return nome;
    }

    // email
    public String getEmail() {
        return email;
    }
    
    // Métodos

    @Override
    public void setNome(String value) {
        this.nome = value;
    }

    @Override
    public void setEmail(String value) {
        this.email = value;
    }
}