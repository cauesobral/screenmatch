package br.com.caue.modelos;

public class CalculadoraDeTempo {
    private int tempoTotal;

    private int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();
    }
    
}
