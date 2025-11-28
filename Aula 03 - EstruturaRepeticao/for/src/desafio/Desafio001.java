package desafio;

import java.util.Scanner;

public class Desafio001 {
    public static void main(String[] args) {
        // Pedir um número positivo
        // Pedir o fatorial

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int fatorial = 0;
        for (int i = numero; i > 1; i--) {
            fatorial = numero * i;
            System.out.println(fatorial);
        }
        if (fatorial != numero) {
            System.out.println("O valor digitado foi: " + fatorial);}
    }

    }
