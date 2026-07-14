package br.com.caue.service;

import br.com.caue.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    private int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }

}
