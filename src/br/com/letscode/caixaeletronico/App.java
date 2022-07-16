package br.com.letscode.caixaeletronico;

import br.com.letscode.caixaeletronico.services.SelecionaComando;

public class App {

    public static void main(String[] args) {

        System.out.println("Caixa Eletronico Ligado!");

        SelecionaComando selecionaComando = new SelecionaComando();
        while (selecionaComando.executar()) {
            System.out.println("Executando um novo comando!");
        }

        System.out.println("Caixa Eletronico Desligado!");

    }
}
