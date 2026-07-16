package br.com.caue;

import br.com.caue.model.*;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Principal {
    static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme para a busca: ");
        var filme = scanner.nextLine();

        String apikey = "ee6c8d00";

        String endereco = "http://www.omdbapi.com/?t="+filme+"&apikey="+apikey;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println("Titulo: " +tituloOmdb);

        Titulo titulo = new Titulo(tituloOmdb);
        System.out.println("Titulo: " +titulo);

    }
}
