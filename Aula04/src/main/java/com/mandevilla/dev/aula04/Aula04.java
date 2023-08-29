package com.mandevilla.dev.aula04;

import com.mandevilla.dev.aula04.Questoes.PrimeiraQuestao;
import com.mandevilla.dev.aula04.Questoes.SegundaQuestao;
import com.mandevilla.dev.aula04.Questoes.TerceiraQuestao;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-28
 */
public class Aula04 {

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
                    default -> { 
                        System.out.println("Alternativa não implementada! Tente novamente.\n"); 
                    }
                }
            }
        }
        catch (Exception ex){
            System.out.println("Erro na execução do programa.");
        }
    }
}
