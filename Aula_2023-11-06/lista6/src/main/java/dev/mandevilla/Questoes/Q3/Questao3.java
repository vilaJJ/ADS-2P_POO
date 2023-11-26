package dev.mandevilla.Questoes.Q3;

import dev.mandevilla.Questoes.Q3.Classes.Subclass.Circulo;
import dev.mandevilla.Questoes.Q3.Classes.Subclass.Retangulo;
import dev.mandevilla.Questoes.Q3.Classes.Subclass.Triangulo;

public class Questao3 {
    private final static Circulo circulo = new Circulo(20);
    private final static Triangulo triangulo = new Triangulo(15, 10);
    private final static Retangulo retangulo = new Retangulo(60, 20);

    public static void executar() {
        try {
            System.out.println(
                String.format(
                    "Área do Círculo {raio = %.2f}\n\t-> %.2f",
                    circulo.getRaio(),
                    circulo.calcularArea()
                )
            );

            System.out.println(
                String.format(
                    "Área do Triângulo {base = %.2f, altura = %.2f}\n\t-> %.2f",
                    triangulo.getBase(),
                    triangulo.getAltura(),
                    triangulo.calcularArea()
                )
            );

            System.out.println(
                String.format(
                    "Área do Retângulo {comprimento = %.2f, largura = %.2f}\n\t-> %.2f",
                    retangulo.getComprimento(),
                    retangulo.getLargura(),
                    retangulo.calcularArea()
                )
            );
        } catch (Exception e) {
            System.err.println("Erro na execução da Questão 3. " + e.getMessage());
            return;
        }
    }
}
