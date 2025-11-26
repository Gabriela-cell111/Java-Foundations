package exercicios;

import java.util.Scanner;

public class Desafio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do empréstimo R$: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite o número de parcelas desejada: 6/12/24 ");
        String parcela = sc.nextLine();

        if (parcela.equals("6")) {
            double valor2 = valor * 1.05;
            System.out.println("O valor final será de " + valor2);
        }
        else if (parcela.equals("12")) {
            double valor3 = valor * 1.1;
            System.out.println("O valor final será de " + valor3);
        }
        else{
            double valor4 = valor * 1.2;
            System.out.println("O valor final será de " + valor4);
        }

        sc.close();

    }
}
