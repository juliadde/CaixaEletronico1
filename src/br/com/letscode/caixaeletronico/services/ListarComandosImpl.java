package br.com.letscode.caixaeletronico.services;

public class ListarComandosImpl implements ListarComandos{
    @Override
    public void execute() {
        System.out.println("Informe a opção desejada: ");
        System.out.println("Opção 1 - Sacar");
        System.out.println("Opção 2 - Depositar");
        System.out.println("Opção 3 - Abrir Nova Conta");
        System.out.println("Opção 0 - Encerrar Operação");

    }

}
