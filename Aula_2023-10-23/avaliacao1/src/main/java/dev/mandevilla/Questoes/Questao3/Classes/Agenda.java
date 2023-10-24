package dev.mandevilla.Questoes.Questao3.Classes;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private final List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public int obterIndiceContato(String value) {
        int index = 0;
        for (Contato contato : contatos) {
            if (value.equals(contato.obterNome()) || 
                value.equals(contato.obterNumeroTelefone()) || 
                value.equals(contato.obterEnderecoEmail())) {
                return index;
            }
            else {
                index++;
            }
        }

        return -1;
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void excluirContato(String value) {
        int index = obterIndiceContato(value);

        if (index == -1) {
            return;
        }

        contatos.remove(index);
    }

    public String listarContatos() {
        String retorno = "Listando contatos:\n";

        for (Contato contato : contatos) {
            retorno += contato.apresentarContato() + "\n";
        }

        return retorno;
    }
}
