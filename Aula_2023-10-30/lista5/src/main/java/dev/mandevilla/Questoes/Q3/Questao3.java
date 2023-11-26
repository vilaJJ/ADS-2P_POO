package dev.mandevilla.Questoes.Q3;

public class Questao3 {
    public static void executar() {
        System.out.println("Tabuada de 1 à 10:\n");

        for(int i = 1; i <= 10; i++) {
            System.out.println(String.format("Tabuada de %d:\n", i));

            for (int j = 0; j <= 10; j++) {
                System.out.println(String.format(
                    "\t-> %d x %d = %d", 
                    i,
                    j,
                    i * j
                ));
            }

            System.out.println("-------------------------");
        }
    }
}
