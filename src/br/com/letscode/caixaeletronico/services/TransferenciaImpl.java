package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.model.Conta;

public class TransferenciaImpl implements Transferencia {
    @Override
    public void transferir(double valor, Conta favorecido, Conta origem) {
        System.out.println("Informe o valor de transferencia: " + valor + ", o numero da conta destino: "
                + favorecido + " o numero da conta origem: " + origem  );
    }
}
