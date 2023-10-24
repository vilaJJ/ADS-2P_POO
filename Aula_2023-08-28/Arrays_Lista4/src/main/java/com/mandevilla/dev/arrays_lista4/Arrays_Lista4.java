package com.mandevilla.dev.arrays_lista4;

import com.mandevilla.dev.arrays_lista4.Questoes.PrimeiraQuestao;
import com.mandevilla.dev.arrays_lista4.Questoes.SegundaQuestao;
import com.mandevilla.dev.arrays_lista4.Questoes.TerceiraQuestao;
import com.mandevilla.dev.arrays_lista4.Questoes.QuartaQuestao;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-08-29
 */
public class Arrays_Lista4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int questao;
       
        try{
            while(true){
                System.out.print("Escolha das alternativas 1 a 4 para serem executadas (0 encerra o programa): ");
                questao = scanner.nextInt();

                switch(questao){
                    case 0:
                        return;
                    case 1:
                        var primeiraQuestao = new PrimeiraQuestao();
                        primeiraQuestao.Executar();
                        return;
                    case 2:
                        var segundaQuestao = new SegundaQuestao();
                        segundaQuestao.Executar();
                        return;
                    case 3:
                        var terceiraQuestao = new TerceiraQuestao();
                        terceiraQuestao.Executar();
                        return;
                    case 4:
                        var quartaQuestao = new QuartaQuestao();
                        quartaQuestao.Executar();
                        return;
                    default:
                        System.out.println("Alternativa não implementada! Tente novamente.\n");
                        break;
                }
            }
        }
        catch (Exception ex){
            System.out.println(String.format("Erro na execução do programa. %s", ex.getMessage()));
        }

        scanner.close();
    }
}