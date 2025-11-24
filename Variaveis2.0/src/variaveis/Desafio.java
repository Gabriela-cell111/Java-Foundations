package variaveis;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("População da cidade:");
        int povo = sc.nextInt();

        System.out.println("Tamanho da cidade de:" );
        double cidade = sc.nextDouble();


        System.out.println("A População é :" + povo + "\nTamnho da cidade é:" + cidade + "km²");
        sc.close();
    }
}
