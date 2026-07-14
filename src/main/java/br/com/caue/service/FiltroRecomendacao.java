package br.com.caue.service;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está muito bem classificado!");
        } else if (classificavel.getClassificacao() >= 3) {
            System.out.println("Tá bem classificado!");
        } else if  (classificavel.getClassificacao() >= 2) {
            System.out.println("Coloque na sua lista para assistir depois");
        }  else if (classificavel.getClassificacao() >= 1) {
            System.out.println("Poderia estar melhor classificado...");
        }
    }
}
