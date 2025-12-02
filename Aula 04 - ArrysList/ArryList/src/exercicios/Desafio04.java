package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList();
        palavras = new ArrayList<>();
        palavras.add("Abacate");
        palavras.add("Kiwi");
        palavras.add("Caqui");
        palavras.add("Limão");

        for(String palavra : palavras){
            System.out.println(palavra);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual caracter você deseja remover:");
        String caracter = sc.nextLine();

        palavras.removeIf(letras -> letras.contains(caracter));
        for(String palavra : palavras){
            System.out.println(palavra);
        }
    }
}
