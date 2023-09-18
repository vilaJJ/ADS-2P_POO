/*
6. A declaração de imposto de renda deve ser enviada anualmente para a Receita Federal. 
Faça um algoritmo em Java que calcula a alíquota, com base na tabela, a ser descontado do salário de uma pessoa física. 
Entre com o salário da pessoa física e escreva, no navegador, o salário bruto e o salário líquido, já com o desconto da alíquota. 
Dica: utilize Classe, métodos e objetos.

Base de cálculo mensal em R$            Alíquota %              Parcela a deduzir do imposto em R$
Até 1.787,77                            Isento                  0
De 1.787,78 até 2.679,29                7,5                     134,08
De 2.679,30 até 3.572,43                15,0                    335,03
De 3.572,44 até 4.463,81                22,5                    602,96
Acima de 4.463,81                       27,5                    826,15
 */
package dev.mandevilla.lista4_classesobjetos.Classes.Questao6;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-14
 */
public class CalculoIRRF {
    private final float salario;
    private final float minValue;
    private final float maxValue;
    private final float aliquota;
    private final float taxa;
    
    public CalculoIRRF(float salario){
        this.salario = salario;
        
        if (this.salario <= 1_787.77) {
            this.minValue = 0.00f;
            this.maxValue = 1_787.77f;
            this.aliquota = 0.0f;
            this.taxa = 0.00f;
        }
        else if (this.salario <= 2_679.29) {
            this.minValue = 1_787.78f;
            this.maxValue = 2_679.29f;
            this.aliquota = 7.5f;
            this.taxa = 134.08f;
        }
        else if (this.salario <= 3_572.43) {
            this.minValue = 2_679.30f;
            this.maxValue = 3_572.43f;
            this.aliquota = 15.0f;
            this.taxa = 335.03f;
        }
        else if (this.salario <= 4_463.81) {
            this.minValue = 3_572.43f;
            this.maxValue = 4_463.82f;
            this.aliquota = 22.5f;
            this.taxa = 602_96f;
        }
        else{
            this.minValue = 4_463.83f;
            this.maxValue = 0.00f;
            this.aliquota = 27.5f;
            this.taxa = 826.15f;
        }
    }

    public float getMinValue() {
        return minValue;
    }
    public float getMaxValue() {
        return maxValue;
    }
    public float getAliquota() {
        return aliquota;
    }
    public float getTaxa() {
        return taxa;
    }
    
    public float getTaxaMensal(){
        return ((salario * (aliquota / 100)) - taxa);
    }
}