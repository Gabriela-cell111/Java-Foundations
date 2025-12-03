package exercicios;

import java.util.ArrayList;
import java.util.Collection;

public class Correcao05 {
    public static void main() {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> listaPar = new ArrayList<>();
        ArrayList<String> listaImpar = new ArrayList<>();
        lista.add("Abacate");
        lista.add("Kiwi");
        lista.add("Caqui");
        lista.add("Limão");

        for(String frutas : lista){
            int tamanhoFrutas = frutas.length();
            int resto = tamanhoFrutas % 2;
            if(resto ==0){
                listaPar.add(frutas);
            }else {
                listaImpar.add(frutas);
            }

        }
        System.out.println("Lista Par: " + listaPar);
        System.out.print("Lista Ímpar: " + listaImpar);






    }
}
