package dev.mandevilla.bancomonetario3.Banco.Components.Conta.Interfaces;

public interface IConta {
    String getSaldo();
    String getInformacoesGerais();
    String getExtrato();
    
    boolean setTransferencia(String cpf_cnpj_destinatario, String numeroConta_destinatario, float value);
    
    boolean setDeposito(float value);
    boolean setSaque(float value);
}
