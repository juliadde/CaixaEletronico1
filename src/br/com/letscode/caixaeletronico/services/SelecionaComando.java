package br.com.letscode.caixaeletronico.services;

import java.util.Scanner;

public class SelecionaComando {
    private final ListarComandos listarComandos;
    private final ObtemComando obtemComando;
    private final ExecutaComandoEspecico executaComandoEspecico;

    public SelecionaComando() {
        this.listarComandos = new ListarComandosImpl();
        this.obtemComando = new ObtemComandoImpl();
        this.executaComandoEspecico = new ExecutaComandoEspecificoImpl();
    }

    public boolean executar() {
        listarComandos.execute();
        int comando = obtemComando.execute();
        return executaComandoEspecico.execute(comando);
    }
}


