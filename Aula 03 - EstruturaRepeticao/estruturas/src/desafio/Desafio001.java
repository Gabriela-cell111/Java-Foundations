package desafio;

import java.util.Scanner;

public class Desafio001 {
    public static void main(String[] args) {
        // Pedir um número positivo
        // Pedir o fatorial

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int fatorial = 1;
        if (numero < 0) {
            System.out.println("Não existe  fatorial para números negativos");

        } else {
            for (int i = numero; i <= numero; i++) {
                fatorial = fatorial * i;
                System.out.println("O fatoril é igual á " + fatorial);
                sc.close();
            }
        }
    }
}





