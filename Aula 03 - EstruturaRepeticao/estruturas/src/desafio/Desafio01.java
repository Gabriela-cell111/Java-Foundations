package desafio;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
       // Desafio que some 6 valores digitados pelo usuárip
       // O programa so irá somar Ìmpar e mútiplo de três

        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <=6; i++) {
            System.out.println("Digite um numero: ");

            int numero = sc.nextInt();

            int resto = numero % 2;
            int multiplo = numero % 3;


            if(resto != 0 && multiplo == 0){
                soma += numero;
            }
        }

        System.out.println("A soma é = " + soma);
         sc.close();
    }
}
