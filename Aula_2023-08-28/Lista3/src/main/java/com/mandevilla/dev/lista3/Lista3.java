package com.mandevilla.dev.lista3;

import com.mandevilla.dev.lista3.Questoes.PrimeiraQuestao;
import com.mandevilla.dev.lista3.Questoes.SegundaQuestao;
import com.mandevilla.dev.lista3.Questoes.TerceiraQuestao;
import com.mandevilla.dev.lista3.Questoes.QuartaQuestao;
import com.mandevilla.dev.lista3.Questoes.QuintaQuestao;
import com.mandevilla.dev.lista3.Questoes.SextaQuestao;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-28
 */
public class Lista3 {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int questao;
        
        try{
            while(true){
                System.out.print("Escolha das alternativas 1 a 6 para serem executadas (0 encerra o programa): ");
                questao = scanner.nextInt();
                
                switch(questao){
                    case 0 -> { 
                        return; 
                    }
                    case 1 -> {
                        var primeiraQuestao = new PrimeiraQuestao();
                        primeiraQuestao.Executar();
                        return;
                    }
                    case 2 -> {
                        var segundaQuestao = new SegundaQuestao();
                        segundaQuestao.Executar();
                        return;
                    }
                    case 3 -> {
                        var terceiraQuestao = new TerceiraQuestao();
                        terceiraQuestao.Executar();
                        return;
                    }
                    case 4 -> {
                        var quartaQuestao = new QuartaQuestao();
                        quartaQuestao.Executar();
                        return;
                    }
                    case 5 -> {
                        var quintaQuestao = new QuintaQuestao();
                        quintaQuestao.Executar();
                        return;
                    }
                    case 6 -> {
                        var sextaQuestao = new SextaQuestao();
                        sextaQuestao.Executar();
                        return;
                    }
                    default -> { 
                        System.out.println("Alternativa não implementada! Tente novamente.\n"); 
                    }
                }
            }
        }
        catch (Exception ex){
            System.out.println(String.format("Erro na execução do programa. %s", ex.getMessage()));
        }
    }
}