package exercios;

import java.util.Scanner;

public class ExercioDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do{
        System.out.println("Escola uma opção");
        System.out.println("1 - Continuar");
        System.out.println("2 -Sair");

        opcao = sc.nextInt();

        } while(opcao == 1 );
        System.out.println("Você saiu no programa");





        sc.close();






    }
}
