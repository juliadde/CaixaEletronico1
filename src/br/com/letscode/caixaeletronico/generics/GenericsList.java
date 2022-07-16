package br.com.letscode.caixaeletronico.generics;

import br.com.letscode.caixaeletronico.model.Conta;
import br.com.letscode.caixaeletronico.repository.BaseRepository;
import br.com.letscode.caixaeletronico.repository.MemoriaContaRepository;

public class GenericsList {
    public static void main(String[] args) {
        MemoriaContaRepository repository = new MemoriaContaRepository();

        Conta conta1 = new Conta();
        conta1.adicionaSaldo(100);

        Conta conta2 = new Conta();
        conta2.adicionaSaldo(50);

        repository.adiciona(conta1);
        repository.adiciona(conta2);

        System.out.println(repository.findById(0).getSaldo());

        System.out.println(repository.findById(1).getSaldo());
    }
}
