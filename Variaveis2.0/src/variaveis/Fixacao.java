package variaveis;

import java.util.Scanner;

public class Fixacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Armazenar a cidade
        System.out.println("Digite a cidade: ");
        String city = sc.nextLine();
        System.out.println(city);


        //Armazenar a UF
        System.out.println("Digite a UF:");
        String uf = sc.next();
        System.out.println(uf);

        // barra invertida significa quebra de linha

        //Metodo NextiNT - CAPTURAR NUMEROS
        int idade = sc. nextInt();
        //Metodo NextDouble -CAPTURAR NUEMROS DECIMAIS
        double altura = sc.nextDouble();



        sc.close();

    }
}
