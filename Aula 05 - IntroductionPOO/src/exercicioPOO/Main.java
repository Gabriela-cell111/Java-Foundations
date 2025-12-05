package exercicioPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoPoo aluno = new AlunoPoo();//Construtor ("AlunoPoo")

        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Digite o nota do aluno: ");
        aluno.nota1 = sc.nextDouble();

        System.out.print("Digite o nota do aluno: ");
        aluno.nota2 = sc.nextDouble();

        System.out.println("Nome:"+ aluno.nome);
        System.out.println("Nota 1 :"+aluno.nota1);
        System.out.println("Nota 2 :"+aluno.nota2);
        System.out.println("Media: "+ aluno.calculoMedia());


        sc.close();
    }
}
