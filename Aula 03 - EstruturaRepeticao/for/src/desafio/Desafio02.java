package desafio;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
       // Crie um programa qdesafando amáquina
       // A máquina vai gerar  um número  entre 0 á 100 e você vai tentar aacertar esse nuemro
       // O programa só vai encerrar quando você acertar, informe se o valor que o usuário digitou
       // a maior ou menor o que a gerou


        Scanner sc = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 101);

        while (true) {

            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            if (numero == aleatorio) {
                System.out.println("Você acertou!");
                break;
            }else if (numero < aleatorio) {
                System.out.println("Mais");
            }else {
                System.out.println("Menos");
            }



        }
        sc.close();
    }
}
