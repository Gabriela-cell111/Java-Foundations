package exercicios;

import java.util.Scanner;

public class Textos {
    static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Você está grávida: S/N ");
        String resposta = sc.nextLine();

        //É usado equals() para comprar valores do tipo String
        if (resposta.equals("S")) {
            System.out.println("Você não paga a passagem!");
        }
        else {
            System.out.println("Você irá pagar a passagem!");


        }


        sc.close();


    }
}
