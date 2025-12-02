package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList();
        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Digite palavras aleatórias: ");
            String palavras_usuario = input.nextLine();
            palavras.add(palavras_usuario);

            int tamanho = palavras_usuario.length();
            int modulo = tamanho%2;

            for(String palavra : palavras){
                System.out.println("LISTA:" + palavra);

                if(modulo == 0){
                    System.out.println("Palvras com comprimento par: " + palavra);
                }else{
                    System.out.println("Palvras com comprimento ímpar: " + palavra);
                }
            }
            for(String palavra : palavras) {
                System.out.println("LISTA:" + palavra);
            }
        }
    }
}
