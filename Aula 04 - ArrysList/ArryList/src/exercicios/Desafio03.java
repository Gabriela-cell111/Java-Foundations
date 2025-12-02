package exercicios;

import java.util.ArrayList;

public class Desafio03 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList();
        numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(10);
        numeros.add(20);
        numeros.add(20);
        numeros.add(6);
        numeros.add(6);
        numeros.add(5);
        numeros.add(9);

        for (int numero : numeros) {
            System.out.println("NÚMEROS: " + numero);

        }

        int modulo = numeros.size() %2;
        if (modulo == 0) {
            System.out.println("Números pares: " + numeros);
        }

    }
}
