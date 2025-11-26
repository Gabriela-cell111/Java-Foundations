package exercicios;

import java.util.Scanner;

public class Deafio1 {
    static void main(String[] args) {

        //Desafio 1 - Nota do alunos
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota:");
        double nota = sc.nextDouble();
        if (nota >= 9){
            System.out.println("Aprovado - com Distinção - excelente!");
        }
        if (nota <= 5) {
            System.out.println("Reprovado - precisa melhorar.");
        }
        else if (nota <= 6.9) {
            System.out.println("Recuperação - dedicação necessária.");
        }
        else {
            System.out.println("Aprovado - desempenho satisfatório.");
        }



    sc.close();

    }
}
