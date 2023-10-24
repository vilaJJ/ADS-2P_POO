package dev.mandevilla.bancomonetario;

import dev.mandevilla.bancomonetario.Banco.Banco;
import java.util.Scanner;

/**
 * @author Juan Felipe Alves Flores
 * @since 2023-09-18
 */
public class BancoMonetario {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var banco = new Banco();
        
        try{
            while (true){
                System.out.println("Banco Monetário: Escoha uma operação\n");
        
                System.out.println("[1] -> Acessar conta");
                System.out.println("[2] -> Criar conta");
                System.out.println("[0] -> Encerrar atendimento");

                System.out.print("\nInsira o código da operação: ");
                var codigo = scanner.nextInt();

                switch (codigo){
                    case 0 -> {
                        System.out.println("Atendimento encerrado. Tenha um bom dia!");
                        return;
                    }
                    case 1 -> {
                        banco.acessarContaBancaria();
                    }
                    case 2 -> {
                        banco.criarContaBancaria();
                    }
                    default -> banco.informacaoBanco("Operação inválida, tente novamente.");
                }
            }
            
        }
        catch (Exception ex){
            System.out.print("Erro interno.");
        }

        scanner.close();
    }
}
