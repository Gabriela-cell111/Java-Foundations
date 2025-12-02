package exercicios;

import java.util.ArrayList;

public class Desafio02 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList();
        numeros = new ArrayList<>();
        numeros.add(10.0);
        numeros.add(10.0);
        numeros.add(10.0);
        numeros.add(10.0);

        double soma = 0;
        double media = 0;

        for(Double numero: numeros)
            soma += numero;
            media = soma/numeros.size();
        System.out.println(numeros);
        System.out.println("Soma = " + soma );
        System.out.println("Média = " + media);

    }
}
