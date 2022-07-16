package br.com.letscode.caixaeletronico.services;

public class DepositoImpl implements Deposito{
    @Override
    public void execute(double valor, int numeroDaConta){
        System.out.println("Você depositou: " + valor + "na conta: " + numeroDaConta);
    }
}
