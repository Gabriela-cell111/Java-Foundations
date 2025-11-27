package exercicios;

import java.util.Scanner;

public class Deafio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra R$: ");
        double compra = sc.nextDouble();
        sc.nextLine();

        System.out.println("Digite a quantidade de itens: ");
        int itens = sc.nextInt();
        sc.nextLine();

        if(compra >1000 ){
            double valor1 = compra *0.80;
            System.out.println("Total:" + valor1);
        }
        sc.nextLine();

        if (compra > 300 && compra < 500 || itens > 3 && itens < 5){
            double valor2 = compra *0.95;
            System.out.println("Total:" + valor2);

        }else if (compra > 500 && compra < 1000 || itens>5 ) {
            double valor2 = compra * 0.90;
            System.out.println("Total:" + valor2);
        }
        else {
                System.out.println("Total R$:" + compra);
            }



    }
}
