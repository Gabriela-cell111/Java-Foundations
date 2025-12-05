package Desafio;

import javax.management.relation.RoleUnresolvedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca: ");
        String marca = sc.nextLine();

        System.out.print("Digite a tipo: ");
        String tipo = sc.nextLine();

        System.out.print("Digite o tamanho: ");
        String tamanho = sc.nextLine();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o valor: ");
        double valor = sc.nextDouble();

        Roupa estoque = new Roupa(sc.nextLine(), marca, tipo, tamanho, quantidade, valor);
        System.out.println(estoque.toString());

        System.out.println("Você deseja:");
        System.out.println("1 - Incrementar:");
        System.out.println("2 - Decrementar:");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quantidade: ");
                int retorno = sc.nextInt();
                estoque.retorno(retorno);
                System.out.println(estoque.toString());
                break;


                case 2:
                    System.out.println("Quantidade: ");
                    int retirar = sc.nextInt();
                    estoque.retira(retirar);
                    System.out.println(estoque.toString());
                    break;
                    default:
        }
    }
}
