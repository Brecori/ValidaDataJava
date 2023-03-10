package br.com.fiap.ex1.app;

import br.com.fiap.ex1.model.Data;
import com.google.gson.Gson;

public class main {
    public static void main(String[] args) {
        Data hoje = new Data(28, 2, 2004);

        Gson conversor = new Gson();
        String s = conversor.toJson(hoje);

        System.out.println(s);
    }
}
