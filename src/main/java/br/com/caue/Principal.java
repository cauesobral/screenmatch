package br.com.caue;

import br.com.caue.model.Favoritos;
import br.com.caue.model.Musica;
import br.com.caue.model.Podcast;
import br.com.caue.model.Serie;

public class Principal {
    static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Saving Grace");
        minhaMusica.setCantor("KIRBY");

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setHost("Igor 3K");
        meuPodcast.setDescricao("Jogos");

        Favoritos favoritos = new Favoritos();
        favoritos.inclui(meuPodcast);
        favoritos.inclui(minhaMusica);

        
    }
}
