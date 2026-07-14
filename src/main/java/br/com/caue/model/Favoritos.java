package br.com.caue.model;

public class Favoritos {
    public void inclui (Audio audio) {
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo()+" É um dos áudios favoritos.");
        } else {
            System.out.println(audio.getTitulo()+" É um dos que o pessoal gosta.");
        }
    }
}
