package exercicios;

import java.util.Scanner;

public class Desafio2 {
    static void main(String[] args) {
        // Calcular multa
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a velocidade:");
        double velocidade = sc.nextDouble();
        if (velocidade == 90) {
            System.out.println("Não levou multa");

        } else if ((velocidade > 90)) {
            double valor1 = velocidade - 90;
            double multa = valor1 * 10;
            System.out.println("Multa:" + multa);
        } else {
            System.out.println("Não levou multa");

        }
        sc.close();
    }
}


