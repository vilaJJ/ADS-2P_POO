package dev.mandevilla.Questoes.Questao6.Classes;

public class Ponto {
    private final ParOrdenado parOrdenado;

    public Ponto(ParOrdenado parOrdenado) {
        this.parOrdenado = parOrdenado;
    }

    public ParOrdenado obterParOrdenado() {
        return parOrdenado;
    }

    public double calcularDistancia(Ponto ponto2) {
        ParOrdenado par1 = parOrdenado;
        ParOrdenado par2 = ponto2.obterParOrdenado();
        
        double calc1 = Math.pow(par1.obterX() - par2.obterX(), 2);
        double calc2 = Math.pow(par1.obterY() - par2.obterY(), 2);

        double calcFinal = Math.sqrt(
            calc1 + calc2
        );

        return calcFinal;
    }
}
