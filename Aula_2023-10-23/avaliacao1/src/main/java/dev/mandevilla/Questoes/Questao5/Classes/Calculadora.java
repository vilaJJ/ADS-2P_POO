package dev.mandevilla.Questoes.Questao5.Classes;

public class Calculadora {
    public Number realizarCalculo(char operador, int value1, int value2) throws Exception {
        switch (operador){
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                return value1 / value2;
            default:
                throw new Exception("Insira um operador válido.");
        }
    }

    public Number realizarCalculo(char operador, float value1, float value2) throws Exception {
        switch (operador){
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                return value1 / value2;
            default:
                throw new Exception("Insira um operador válido.");
        }
    }
}
