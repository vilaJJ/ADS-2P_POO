package dev.mandevilla.Questoes.Q7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import dev.mandevilla.Questoes.Q7.Classes.Boi;
import dev.mandevilla.Questoes.Q7.Comparatores.BoiComparator;

public class Questao7 {
    private final static List<Boi> bois = new ArrayList<Boi>(
        Arrays.asList(
            new Boi(52046, 523.84f),
            new Boi(73549, 398.56f),
            new Boi(31204, 561.32f),
            new Boi(63432, 532.41f),
            new Boi(76354, 489.52f),
            new Boi(15693, 487.21f),
            new Boi(86104, 452.36f),
            new Boi(16547, 442.28f),
            new Boi(10649, 501.56f),
            new Boi(86147, 531.58f)
        )
    );

    public static void executar() {
        // Fazer um algoritmo que leia o numero de identificação e o peso de cada boi, 
        // e que calcule e escreva o peso do boi mais gordo e o peso do boi mais magro.

        if (bois.size() == 0) {
            System.out.println("Não existem bois cadastrados.");
            return;
        }
        
        Collections.sort(bois, new BoiComparator());
        
        Boi boi_MaisMagro = bois.get(0);
        Boi boi_MaisGordo = bois.get(bois.size() - 1);

        System.out.println("--------------------------------------------------------------------------------");

        System.out.println(
            String.format(
                "Boi mais magro:\n\t-> ID. #%d (%.2f kg)",
                boi_MaisMagro.getId(),
                boi_MaisMagro.getPeso()
            )
        );

        System.out.println(
            String.format(
                "Boi mais gordo:\n\t-> ID. #%d (%.2f kg)",
                boi_MaisGordo.getId(),
                boi_MaisGordo.getPeso()
            )
        );

        System.out.println("--------------------------------------------------------------------------------");
    }
}
