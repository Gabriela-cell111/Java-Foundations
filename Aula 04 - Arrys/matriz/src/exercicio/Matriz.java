package exercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[5];
        //Adicinar elementos na matriz:
        notas[0] = 5;
        notas[1] = 4;
        notas[2] = 8;
        notas[3] = 9;
        notas[notas.length - 1] =6;

        System.out.println(Arrays.toString(notas)); // Aparece inteiro
        System.out.println(notas[notas.length - 1]); // Final

        //Percorrer a matriz:

        //Modo 01
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        //Modo 02
        for (int nota : notas) {
            System.out.println(nota);
        }

        sc.close();
    }
}
