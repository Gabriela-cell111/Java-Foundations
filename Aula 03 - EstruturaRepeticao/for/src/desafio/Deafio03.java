package desafio;

import java.util.Scanner;

public class Deafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        int contador = 0;
        System.out.println(soma + contador);


        while (true) {
            System.out.println("Digite um numero: ");
            double numero = sc.nextInt();

            if (numero == 0) break;

            soma += numero;

            contador++;

        }
        System.out.println("A soma é igual á" + soma);
        System.out.println("A média é igual á" + soma / contador);
        sc.close();

    }
}
