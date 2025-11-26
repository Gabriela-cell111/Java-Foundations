package exercicios;

import java.util.Scanner;

public class Desafio3 {
    static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 10: ");
    int jogador = sc.nextInt();
    int aletorio = (int) (Math.random() *10);
        if (jogador == aletorio) {
            System.out.println("Acertou!");
        }
        else{
            System.out.println("Você errou!");
            System.out.println("O número da máquina é:" + aletorio);
        }

sc.close();
    }
}
