package exercicios;

import java.util.Scanner;

public class Desafio04suit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe quantos reais você possui:");
        double reais = sc.nextDouble();
        sc.nextLine();

        System.out.println("Informe para qual moeda você deseja converter:");
        System.out.println(" 1 - Dólar");
        System.out.println(" 2 - Euro");
        System.out.println(" 3 - libra");
        System.out.println("O metoddo escolhido foi:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                double dolar = reais * 0.20;
                System.out.println("$" + dolar);
                break;

            case 2:
                double euro = reais * 0.18;
                System.out.println("€" + euro);
                break;
            case 3:
                double libra = reais * 0.15;
                System.out.println("£" + libra);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
