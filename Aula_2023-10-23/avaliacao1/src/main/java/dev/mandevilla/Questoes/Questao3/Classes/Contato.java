package dev.mandevilla.Questoes.Questao3.Classes;

public class Contato {
    private String nome;
    private String numeroTelefone;
    private String enderecoEmail;

    public Contato(String nome, String numeroTelefone, String enderecoEmail) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
        this.enderecoEmail = enderecoEmail;
    }

    public String obterNome() {
        return nome;
    }
    public String obterNumeroTelefone() {
        return numeroTelefone;
    }
    public String obterEnderecoEmail() {
        return enderecoEmail;
    }

    public void modificarNome(String nome) {
        this.nome = nome;
    }
    public void modificarNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    public void modificarEnderecoEmail(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    public String apresentarContato() {
        String nome = String.format("Nome: %s\n", this.nome);
        String numTelefone = String.format("Número de Telefone: %s\n", this.numeroTelefone);
        String endEmail = String.format("Endereço de email: %s\n", this.enderecoEmail);

        return nome + numTelefone + endEmail;
    }
}
