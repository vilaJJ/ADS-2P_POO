package dev.mandevilla.Questoes.Q2;

import dev.mandevilla.Questoes.Q2.Classes.Subclass.Carro;
import dev.mandevilla.Questoes.Q2.Classes.Subclass.Moto;

public class Questao2 {
    public static void executar() {
        Carro carro = new Carro("Fiat", "Uno", 4);
        Moto moto = new Moto("Honda", "Fan", 160);

        System.out.println(String.format(
            "Carro: %s %s (%d portas)", 
            carro.getMarca(),
            carro.getModelo(),
            carro.getQuantidadePortas()
        ));

        System.out.println(String.format(
            "Moto: %s %s (%dcc)", 
            moto.getMarca(),
            moto.getModelo(),
            moto.getCilindradasMotor()
        ));
    }
}
