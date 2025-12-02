package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio01 {
    public static void main() {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Alice");
        nomes.add("Maria");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.removeIf(itens -> itens.charAt(0) != 'A');
        System.out.println("Quantidade de nomes com a letra A: " + nomes.size());
    }
}
