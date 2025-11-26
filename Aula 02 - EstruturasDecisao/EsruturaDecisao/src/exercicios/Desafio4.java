package exercicios;

import java.util.Scanner;

public class Desafio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor R$: ");
        double valor = sc.nextDouble();
        sc.nextLine();

        System.out.println("Moeda: D - E ou L");
        String moeda = sc.nextLine();

        if (moeda.equals("D")) {
            double conversao1 = valor * 0.20;
            System.out.println("O valor em dólar:" + conversao1 );

        }
        else if (moeda.equals("E")){
            double conversao2 = valor * 0.18;
            System.out.println("O valor em dólar:" + conversao2);
            System.out.println("O valor em euro:" );

        }
        else{
            double conversao3 = valor * 0.15;
            System.out.println("O valor em dólar:" + conversao3 );
            System.out.println("O valor em libra:" );
        }
    sc.close();
    }
}
