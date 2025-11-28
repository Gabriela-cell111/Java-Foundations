package exercios;

import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Digite o numero 999 para parar: ");
            int numero = sc.nextInt();

            System.out.println(numero);

            if(numero == 999){
                System.out.println("Finalizado!");
                break;
            }

        sc.close();



        }



    }

}
