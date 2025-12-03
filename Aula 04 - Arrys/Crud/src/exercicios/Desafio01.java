package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        ArrayList<String> pedidos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true) {
            System.out.println("----- SISTEMA DE PEDIDOS -----");
            System.out.println("1 - Fazer pedidos");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Cancelar pedido");
            System.out.println("5 - Sair do programa");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Digite seu pedido: ");
                    String lanche = sc.nextLine();
                    pedidos.add(lanche);
                    System.out.println("Pedido cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n----LISTA DE PEDIDOS----");
                    if (pedidos.isEmpty()) {
                        System.out.println("NENHUM PEDIDO ADICIONADO");
                    } else {
                        for (String lanches : pedidos) {
                            System.out.println(pedidos.indexOf(lanches) + "-" + lanches);
                        }
                    }
                    break;


                case 3:
                    System.out.println("\n----ATUALIZAR O PEDIDO----");
                    System.out.println("Informe o número do pedido: ");
                    int num = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Informe o novo pedido : ");
                    String nomePedido = sc.nextLine();
                    pedidos.set(num, nomePedido);
                    break;

                case 4:
                    System.out.println("\n----CANCELAR PEDIDO----");
                    System.out.println("Informe o némero do pedido: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    pedidos.remove(numero);
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    return;
            }
        }
    }
}
