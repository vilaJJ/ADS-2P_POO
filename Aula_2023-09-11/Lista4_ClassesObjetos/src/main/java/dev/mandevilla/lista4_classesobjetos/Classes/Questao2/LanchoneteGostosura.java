/*
2. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. 
Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que uma rodela de hambúrguer pesa 100 gramas, faça um algoritmo em Java em que o dono forneça a quantidade de sanduíches a fazer. 
Escreva no navegador as quantidades (em quilos) de queijo, presunto e carne necessários para compra. Dica: utilize Classe, métodos e objetos. 
 */
package dev.mandevilla.lista4_classesobjetos.Classes.Questao2;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-11
 */
public class LanchoneteGostosura {    
    private class Fatia{
        private int quantidadeSanduiches;
        private float pesoUnitarioKG;
        private int fatiasPorSanduiche;
        private float pesoTotal;
        
        public Fatia(float pesoUnitarioKG, int quantidadeSanduiches, int fatiasPorSanduiche){
            this.pesoUnitarioKG = pesoUnitarioKG;
            this.quantidadeSanduiches = quantidadeSanduiches;
            
            setFatiasPorSanduiche(fatiasPorSanduiche);            
            setPesoTotal();
        }
        
        private void setFatiasPorSanduiche(int value){
            this.fatiasPorSanduiche = value;
            setPesoTotal();
        }
        
        public float getPesoTotal(){
            return this.pesoTotal;
        }
        private void setPesoTotal(){
            this.pesoTotal = this.quantidadeSanduiches * (this.pesoUnitarioKG * this.fatiasPorSanduiche);
        }
    }
    
    private class Presunto extends Fatia{
        public Presunto(float pesoUnitarioKG, int quantidadeSanduiches, int fatias) {
            super(pesoUnitarioKG, quantidadeSanduiches, fatias);
        }
    }
    private class Queijo extends Fatia{
        public Queijo(float pesoUnitarioKG, int quantidadeSanduiches, int fatias) {
            super(pesoUnitarioKG, quantidadeSanduiches, fatias);
        }
    }
    private class Carne extends Fatia{
        public Carne(float pesoUnitarioKG, int quantidadeSanduiches, int fatias) {
            super(pesoUnitarioKG, quantidadeSanduiches, fatias);
        } 
    }
    
    private final int quantidadeSanduiche;
    private final Presunto presunto;
    private final Queijo queijo;
    private final Carne carne;
    
    public LanchoneteGostosura(int quantidadeSanduiche){
        this.quantidadeSanduiche = quantidadeSanduiche;
        
        this.presunto = new Presunto(0.05f, this.quantidadeSanduiche, 1);
        this.queijo = new Queijo(0.05f, this.quantidadeSanduiche, 2);
        this.carne = new Carne(0.1f, this.quantidadeSanduiche, 1);
    }
    
    public String getRelatorioPeso(){
        var txtRelatorio =  String.format(
                "-------------------------------------------" +
                "\nRelatório - Lanchonete Gostosura\n" +
                "Quantidade de sanduíches: %d\n\n" +
                "Presunto: %.3f kg\n" +
                "Queijo: %.3f kg\n" +
                "Carne: %.3f kg\n" +
                "-------------------------------------------",
                this.quantidadeSanduiche, 
                this.presunto.getPesoTotal(),
                this.queijo.getPesoTotal(),
                this.carne.getPesoTotal()
        );
        
        return txtRelatorio;
    }
}
