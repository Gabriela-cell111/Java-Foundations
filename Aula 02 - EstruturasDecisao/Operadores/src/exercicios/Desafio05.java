package exercicios;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o usário: ");
        String usuario = sc.nextLine().trim();

        System.out.println("Digite a senha: ");
        String senha = sc.nextLine().trim();


        int total1 = usuario.length();
        int total2 = senha.length();


        if(total1 >= 5 && total2 >= 8){
            System.out.println("Concluído!");

        }else if (total1 < 5 && total2 >= 8 || total1 <= 5 && total2 < 8)
            System.out.println("Usuário ou senha inválido");
        else {
            System.out.println("Usuário ou senha inválido");
        }

        sc.close();

    }
}
