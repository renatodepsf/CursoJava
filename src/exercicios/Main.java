package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        // adicionar elementos na lista
        lista.add("Renato");
        lista.add("Tairine");
        lista.add("Cauã");
        lista.add("Abraão");

        lista.remove(3);
        System.out.println(lista.indexOf("Cauã"));


        // for each para imprimir na tela
        for (String x : lista) {
            System.out.println(x);
        }


    }
}