package dev.mandevilla.Questoes.Q3;

import dev.mandevilla.Questoes.Q3.Classes.Subclasses.Circulo;
import dev.mandevilla.Questoes.Q3.Classes.Subclasses.Retangulo;
import dev.mandevilla.Questoes.Q3.Classes.Subclasses.Triangulo;

public class Questao3 {
    private final static Circulo circulo = new Circulo(5.65);
    private final static Retangulo retangulo = new Retangulo(15.4, 7.28);
    private final static Triangulo triangulo = new Triangulo(21.7, 10.32);

    public static void executar() {
        System.out.println("-----------------------------------");

        System.out.println(
            String.format(
                "Área do círculo (raio = %.2f):\n\t-> %.2f",
                circulo.getRaio(),
                circulo.calcularArea()
            )
        );

        System.out.println(
            String.format(
                "Área do Retângulo (comprimento = %.2f, largura = %.2f):\n\t-> %.2f",
                retangulo.getComprimento(),
                retangulo.getLargura(),
                retangulo.calcularArea()
            )
        );

        System.out.println(
            String.format(
                "Área do Triângulo (base = %.2f, altura = %.2f):\n\t-> %.2f",
                triangulo.getBase(),
                triangulo.getAltura(),
                triangulo.calcularArea()
            )
        );
    }
}
