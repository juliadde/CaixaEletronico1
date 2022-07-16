package br.com.letscode.caixaeletronico.services;

public class SaqueImpl implements Saque {
    @Override
    public Double execute(double valor, int numeroDaConta) {
        if (valor >= 1000) {
            System.out.println("Limite de saque excedido!");
        } else if (valor <= 999.99) {
            System.out.println("Você sacou " + valor);
        } else {
            System.out.println("Opção Inválida!");
        }
        return valor;
    }
}