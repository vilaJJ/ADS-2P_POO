/*
5. A Granja Frangotech possui um controle automatizado de cada frango de sua produção. 
No pé direito do frango há um anel com um chip de identificação; 
no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50. 
Faça um algoritmo em Java para calcular o gasto total da granja para marcar todos os seus frangos. 
Leia como entrada a quantidade de frangos. 
Dica: utilize Classe, métodos e objetos.
 */
package dev.mandevilla.lista4_classesobjetos.Classes.Questao5;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-14
 */
public class GranjaFrangotech {
    private int quantidadeFrangos;
    private final Anel anelChip;
    private final Anel anelAlimentacao;
    
    public GranjaFrangotech(int quantidadeFrangos){
        this.quantidadeFrangos = quantidadeFrangos;
        this.anelChip = new Anel(4.0f, 1);
        this.anelAlimentacao = new Anel(3.5f, 2);
    }
    
    public int getQuantidadeFrangos(){
        return this.quantidadeFrangos;
    }
    public void setQuantidadeFrangos(int value){
        this.quantidadeFrangos = value;
    }
    
    public float getValorAnelChip(){
        return this.anelChip.getValor();
    }
    public void setValorAnelChip(float value){
        this.anelChip.setValor(value);
    }
    
    public int getQntdPorFrangoAnelChip(){
        return this.anelChip.getQuantidadePorFrango();
    }
    public void setQntdPorFrangoAnelChip(int value){
        this.anelChip.setQuantidadePorFrango(value);
    }
    
    public float getValorAnelAlimentação(){
        return this.anelAlimentacao.getValor();
    }
    public void setValorAnelAlimentação(float value){
        this.anelAlimentacao.setValor(value);
    }
    
    public float getGastosAnelChip(){
        var valorKitAnel = this.anelChip.getQuantidadePorFrango() * this.anelChip.getValor();
        return this.quantidadeFrangos * valorKitAnel;
    }
    public float getGastosAnelAlimentacao(){
        var valorKitAnel = this.anelAlimentacao.getQuantidadePorFrango() * this.anelAlimentacao.getValor();
        return this.quantidadeFrangos * valorKitAnel;
    }
    public float getGastosTotais(){
        return getGastosAnelChip() + getGastosAnelAlimentacao();
    }
    
    public String getRelatorioGastos(){
        var relatorio = String.format(
                "---------------------------------------------------------------\n" +
                "Granja Frangotech - Relatório de Gastos\n\n" +
                "Quantidade de frangos: %d\n\n" +
                "Preço do Anel com Chip de Identificação: R$ %.2f\n" +
                "Quantidade por Frango: %d\n\n" +
                "Preço do Anel de Alimentação: R$ %.2f\n" +
                "Quantidade por Frango: %d\n\n" +
                "Gastos com Anéis com Chip de Identificação: R$ %.2f\n" +
                "Gastos com Anéis de Alimentação: R$ %.2f\n\n" +
                "Gasto total: R$ %.2f\n" +
                "---------------------------------------------------------------\n",
                this.quantidadeFrangos,
                this.anelChip.getValor(),
                this.anelChip.getQuantidadePorFrango(),
                this.anelAlimentacao.getValor(),
                this.anelAlimentacao.getQuantidadePorFrango(),
                getGastosAnelChip(),
                getGastosAnelAlimentacao(),
                getGastosTotais()
        );
        return relatorio;
    }
}
