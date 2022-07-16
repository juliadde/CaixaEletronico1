package br.com.letscode.caixaeletronico.services;

import br.com.letscode.caixaeletronico.repository.MemoriaContaRepository;

import java.util.Scanner;

public class ExecutaComandoEspecificoImpl implements ExecutaComandoEspecico{

    private final Deposito deposito;
    private final Saque saque;
    private final AbrirConta abrirConta;

    public ExecutaComandoEspecificoImpl() {
        MemoriaContaRepository repository = new MemoriaContaRepository();
        this.deposito = new DepositoImpl();
        this.saque = new SaqueImpl();
        this.abrirConta = new AbrirContaImpl(repository);

    }
@Override
    public boolean execute(int comando){
    Scanner entrada = new Scanner(System.in);
    boolean resultado = true;
    if (comando == 0) {
        System.out.println("Encerrando o Programa!");
    } else if (comando == 1) {
        this.saque.execute(0.0, 101520);
        System.out.println("Você realizou um saque!");
    } else if (comando == 2) {
        System.out.println("Digite o número da conta: ");
        int numero = entrada.nextInt();
        this.deposito.execute(0.0, numero);

        System.out.println("Digite o valor a ser depositado: ");
        double valor = entrada.nextInt();
        this.deposito.execute(valor, numero);
        System.out.println("Você realizou um depósito!");
    } else if (comando == 3) {
        abrirConta.execute();
    }else {
        System.out.println("Comando inválido!");
    }
    return resultado;
    }

}
