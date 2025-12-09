package exercicios;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua nota: ");
        Double nota1 = sc.nextDouble();
        sc.nextLine();


        System.out.println("Digite sua nota: ");
        Double nota2 = sc.nextDouble();
        sc.nextLine();

        double media = (nota1 + nota2) / 2;

        System.out.println("Sua média foi: " + media);


    sc.close();


    }
}
