package dev.mandevilla.bancomonetario3;

import dev.mandevilla.bancomonetario3.Banco.Banco;
import dev.mandevilla.bancomonetario3.Banco.Components.AutoAtendimento.AutoAtendimento;

public class BancoMonetario3 {

    public static void main(String[] args) {
        var banco = new Banco();
        var autoAtendimento = new AutoAtendimento(banco);

        autoAtendimento.realizarAutoAtendimento();
    }
}
