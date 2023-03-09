package br.com.fiap.ex1.app;

import br.com.fiap.ex1.model.Data;

public class main {
    public static void main(String[] args) {
        Data hoje = new Data(30, 12, 2000);

        System.out.println(hoje.mostraData());
    }
}
