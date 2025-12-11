package desafio;

import java.util.Scanner;

public class Desafio002 {
     public static void main(System[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Informe o termo que você deseja saber: ");
         int termo = sc.nextInt();
         int a = 0, b = 1, soma;

         for (int i = 1; i <= termo; i++) {
             soma = a + b;
             System.out.println(a + ",");
             a = b;
             b = soma;
         }
         sc.close();
     }
}
