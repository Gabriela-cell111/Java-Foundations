package exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite em anos a sua experiência: ");
        int xp = sc.nextInt();
        sc.nextLine();


        if (idade <= 25 && xp <= 2){
            System.out.println("Valor do seguro R$:2000,00 " );
        } else {
            System.out.println("Valor do seguro R$:1800,00");

        }


        sc.close();
    }
}
