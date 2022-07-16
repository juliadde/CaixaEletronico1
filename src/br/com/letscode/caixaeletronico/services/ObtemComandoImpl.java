package br.com.letscode.caixaeletronico.services;

import java.util.Scanner;

public class ObtemComandoImpl implements ObtemComando{
    @Override
    public int execute(){
        System.out.println("Informe o comando desejado: ");
        Scanner entrada = new Scanner(System.in);
        int comando = entrada.nextInt();
        return comando;
    }
}
