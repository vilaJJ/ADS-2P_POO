package dev.mandevilla.bancomonetario;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-18
 */
public class BancoMonetario {
    public static final float TAXA_SAQUE = 5;
    
    public static String informacaoBanco(String value){
        return String.format("Banco Monetário informa: %s", value);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
