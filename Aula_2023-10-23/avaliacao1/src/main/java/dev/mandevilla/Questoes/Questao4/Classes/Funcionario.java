package dev.mandevilla.Questoes.Questao4.Classes;

public class Funcionario {
    private String nome;
    private float salario;

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String obterNome() {
        return nome;
    }
    public float obterSalario() {
        return salario;
    }

    public String realizarAumento(float porcentagem) {
        if (porcentagem <= 0) {
            return "Não é possível realizar cálculos com porcentagem menor ou igual à zero (0).";
        }

        String salarioAnterior = String.format("Salário anterior: R$ %.2f\n", salario);
        
        salario += (salario * (porcentagem / 100));

        String salarioAtual = String.format("Novo salário: R$ %.2f\n", salario);

        return salarioAnterior + salarioAtual;
    }

    public String calcularImpostoRenda() {
        String retorno = "Calculando Imposto de Renda:\n";

        if (salario >= 1_787.78 && salario <= 2_679.29) {
            retorno += "\t-> Alíquota: 7,5%\n";
            retorno += String.format("\t-> Desconto salarial: R$ %.2f", calcularSalarioPorcentagem(7.5f));           
        }
        else if (salario >= 2_679.30 && salario <= 3_572.43) {
            retorno += "\t-> Alíquota: 15%\n";
            retorno += String.format("\t-> Desconto salarial: R$ %.2f", calcularSalarioPorcentagem(15));           
        }
        else if (salario >= 3_572.44 && salario <= 4_463.81) {
            retorno += "\t-> Alíquota: 22,5%\n";
            retorno += String.format("\t-> Desconto salarial: R$ %.2f", calcularSalarioPorcentagem(22.5f));           
        }
        else if (salario > 4_463.81) {
            retorno += "\t-> Alíquota: 27,5%\n";
            retorno += String.format("\t-> Desconto salarial: R$ %.2f", calcularSalarioPorcentagem(27.5f));           
        }
        else {
            retorno += "\t-> Alíquota: Isento\n";
            retorno += "\t-> Desconto salarial: R$ 0,00";
        }

        return retorno;
    }

    private float calcularSalarioPorcentagem(float porcentagem) {
        return salario * (porcentagem / 100);
    }
}
