package dev.mandevilla.Exercicio.Questoes.Q3.Classes;

public class Pessoa {
    private final String nome;
    private final Universidade universidadeTrabalha;
    private final Departamento departamentoTrabalha;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;
    
    public Pessoa(String nome, Universidade universidadeTrabalha, Departamento departamentoTrabalha) {
        this.nome = nome;
        this.universidadeTrabalha = universidadeTrabalha;
        this.departamentoTrabalha = departamentoTrabalha;
    }

    public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
        int anoDiferenca = anoAtual - anoNascimento;
        int mesDiferenca = mesAtual - mesNascimento;
        int diaDiferenca = diaAtual - diaNascimento;

        int idade;

        if (mesDiferenca > 0) {
            idade = anoDiferenca;
        }
        else if (mesDiferenca == 0) {
            if (diaDiferenca >= 0) {
                idade = anoDiferenca;
            }
            else {
                idade = anoDiferenca - 1;
            }
        }
        else {
            idade = anoDiferenca - 1;
        }

        this.idade = idade;
    }

    public String informaNome() {
        return nome;
    }

    public int informaIdade() {
        return idade;
    }

    public void apresentarOndeTrabalha() {
        System.out.println(
            String.format(
                "Olá, sou %s, e trabalho na %s, no %s.",
                nome,
                universidadeTrabalha.getNome(),
                departamentoTrabalha.getNome()
            )
        );
    }

    public void ajustaDataDeNascimento(int dia, int mes, int ano) {
        diaNascimento = dia;
        mesNascimento = mes;
        anoNascimento = ano;
    }
}
