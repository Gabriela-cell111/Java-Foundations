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
        System.out.println("1 - Abastecer");
        System.out.println("2 - Vender");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Quantidade: ");
                int abastecer = sc.nextInt();
                estoque.abastecer(abastecer);
                System.out.println(estoque.toString());
                break;

                case 2:
                    System.out.println("Quantidade: ");
                    int venda = sc.nextInt();
                    estoque.venda(venda);
                    System.out.println(estoque.toString());
                    break;
                    default:
        }
    }
}
