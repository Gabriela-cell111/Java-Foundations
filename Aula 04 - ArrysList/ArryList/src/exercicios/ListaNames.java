package exercicios;

import java.util.ArrayList;

public class ListaNames {
    public static void main() {
        ArrayList< String> nomes = new ArrayList<>();

        //Adicionar valores á lista:
        nomes.add("Pedro");
        nomes.add("Maria");


        //Adicionar um valor em uma posição específica
        nomes.add(1,"Gabriela");


        // Verificar um item na lista
        System.out.println(nomes.get(0));


        //Alterar um valor
        nomes.set(1, "João");
        System.out.println(nomes);

        //Retornar a posição a partir do valor
        System.out.println(nomes.indexOf("João"));
        System.out.println(nomes);

        //Verificar o tamanho da lista
        System.out.println(nomes.size());

        //Remove if
        nomes.removeIf(itens -> itens.charAt(0) == 'G');

        //Pecorrer a lista
        for(String nome : nomes) {
            System.out.println(nome);
        }


    }

}
