package br.com.caue;

import br.com.caue.model.*;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        ArrayList<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("Vingadores", 2023));
        titulos.add(new Titulo("Forest Gump", 1999));
        titulos.add(new Titulo("High School Musical", 1993));

        for (Titulo titulo : titulos) {
            System.out.println(titulo);
            System.out.println("Total de avaliações: "+titulo.getTotalDeAvaliacoes());
        }
    }
}
