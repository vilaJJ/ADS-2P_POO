/*
4. A empresa Hipothelicus paga R$ 10,00 por hora normal trabalhada, e R$ 15,00 por hora extra. 
Faça um algoritmo em Java para calcular e escrever no navegador o salário bruto e o salário líquido do funcionário com base nas horas trabalhadas. 
Considere que o salário líquido do funcionário é igual ao salário bruto, descontado 10% de impostos. 
Dica: utilize Classe, métodos e objetos.
 */
package dev.mandevilla.lista4_classesobjetos.Classes.Questao4;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-11
 */
public class Hipothelicus {
    private float valorHoraNormal;
    private float valorHoraExtra;
    private float descontoImpostos;
    
    public Hipothelicus(){
        this.valorHoraNormal = 10.0f;
        this.valorHoraExtra = 15.0f;
        this.descontoImpostos = 10.0f;
    }
    
    public float getValorHoraNormal(){
        return this.valorHoraNormal;
    }
    public void setValorHoraNormal(float value){
        this.valorHoraNormal = value;
    }
    
    public float getValorHoraExtra(){
        return this.valorHoraExtra;
    }
    public void setValorHoraExtra(float value){
        this.valorHoraExtra = value;
    }
    
    public float getDescontoImpostos(){
        return this.descontoImpostos;
    }
    public void setDescontoImpostos(float value){
        this.descontoImpostos = value; 
    }
    
    public float getFuncSalarioBruto(FuncionarioHipothelicus func){
        var salarioNormal = this.valorHoraNormal * func.getHoraNormalTrabalhada();
        var salarioExtra = this.valorHoraExtra * func.getHoraExtraTrabalhada();
        return salarioNormal + salarioExtra;
    }
    public float getFuncSalarioDesconto(FuncionarioHipothelicus func){
        var salarioBruto = getFuncSalarioBruto(func);
        return (salarioBruto * (this.descontoImpostos / 100));
    }
    public float getFuncSalarioLiquido(FuncionarioHipothelicus func){
        var salarioBruto = getFuncSalarioBruto(func);
        var desconto = getFuncSalarioDesconto(func);
        return salarioBruto - desconto;
    }
    
    public String getFuncRelatorio(FuncionarioHipothelicus func){
        var relatorio = String.format(
                "---------------------------------------------" +
                "\nNome: %s" +
                "\nSalário bruto: R$ %.2f" +
                "\nDesconto (impostos): R$ %.2f" +
                "\n\nSalário líquido: R$ %.2f" +
                "\n---------------------------------------------",
                func.getNome(),
                getFuncSalarioBruto(func),
                getFuncSalarioDesconto(func),
                getFuncSalarioLiquido(func)
        );
        return relatorio;
    }
}

