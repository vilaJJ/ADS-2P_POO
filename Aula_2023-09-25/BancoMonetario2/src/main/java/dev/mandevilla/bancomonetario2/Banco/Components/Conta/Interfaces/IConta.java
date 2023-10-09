package dev.mandevilla.bancomonetario2.Banco.Components.Conta.Interfaces;

public interface IConta {
    String obterSaldo();
    String obterInformacoesGerais();
    String obterExtrato();
    
    boolean realizarTransferencia(String cpf_cnpj_destinatario, String numeroConta_destinatario, float value);
    
    boolean realizarDeposito(float value);
    boolean realizarSaque(float value);
}
