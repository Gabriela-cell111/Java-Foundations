package exercicios;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado A:");
        int ladoA = sc.nextInt();

        System.out.println("Digite o lado B:");
        int ladoB = sc.nextInt();

        System.out.println("Digite o lado C:");
        int ladoC = sc.nextInt();

        boolean ladoAB = ladoA + ladoB > ladoC;
        boolean ladoAC = ladoA + ladoC > ladoB;
        boolean ladoBC= ladoB + ladoC > ladoA;

        if( ladoAB && ladoBC && ladoAC) {
            System.out.println("Sim é possível criar o triângulo!");

        }else{
            System.out.println("Não é possível!");
        }


        sc.close();


    }
}
