package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Desafio001 {
        public static void main(String[] args) {
            ArrayList<String> pedidos = new ArrayList<>();
            ArrayList<Integer> valor = new ArrayList<>();
            ArrayList<Integer> unidade = new ArrayList<>();
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
                        System.out.println("----- MENU -----");
                        System.out.println(" 1 - X-SALADA - R$18.00 ");
                        System.out.println(" 2 - X-BURGUER - R$15.00 ");
                        System.out.println(" 3 - X-BACON - R$21.00");
                        System.out.println("Escolha um lanche: ");
                        int lanche = sc.nextInt();
                        System.out.println("Digite a quantidade: ");
                        int quantidade = sc.nextInt();
                        unidade.add(quantidade);

                        if(lanche == 1){
                            String lanche1 = ("X - SALADA");
                            pedidos.add(lanche1);
                            int valor1 = 18 ;
                            valor.add(valor1);

                        }else if(lanche == 2){
                            String lanche2 = ("X - BURGUER");
                            pedidos.add(lanche2);
                            int valor2 = 15 ;
                            valor.add(valor2);

                        }else{
                            String lanche3 = ("X - BACON");
                            pedidos.add(lanche3);
                            int valor3 = 21;
                            valor.add(valor3);
                        }

                        sc.nextLine();
                        System.out.println("Pedido cadastrado com sucesso!");
                        break;

                    case 2:

                        System.out.println("\n----LISTA DE PEDIDOS----");
                        if (pedidos.isEmpty()) {
                            System.out.println("NENHUM PEDIDO ADICIONADO");
                        } else {
                            for (int i = 0; i < pedidos.size(); i++) {
                                System.out.println(i + " - Lanche: " + pedidos.get(i) + " - Valor: R$" + (valor.get(i) * unidade.get(i)));

                            }
                        }
                        break;

                    case 3:
                        System.out.println("\n----ATUALIZAR O PEDIDO----");
                        System.out.println("----- MENU -----");
                        System.out.println(" 1 - X-SALADA - R$18.00 ");
                        System.out.println(" 2 - X-BURGUER - R$15.00 ");
                        System.out.println(" 3 - X-BACON - R$21.00");

                        System.out.println("Informe o número do pedido: ");
                        int num = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Digite o número do novo pedido: ");
                        int novoPedido = sc.nextInt();
                        sc.nextLine();
                        if(novoPedido == 1){
                            String lanche1 = ("X - SALADA");
                            pedidos.set(num,lanche1);
                            int valor1 = 18 ;
                            valor.add(valor1);

                        }else if(novoPedido == 2){
                            String lanche2 = ("X - BURGUER");
                            pedidos.set(num,lanche2);
                            int valor2 = 15 ;
                            valor.add(valor2);

                        }else{
                            String lanche3 = ("X - BACON");
                            pedidos.set(num,lanche3);
                            int valor3 = 21;
                            valor.add(valor3);
                        }

                        System.out.println("Digite a quantidade: ");
                        int novaQuantidade = sc.nextInt();
                        unidade.set(num, novaQuantidade);

                        System.out.println("Pedido atualizado com sucesso!");
                        break;

                    case 4:
                        System.out.println("\n----CANCELAR PEDIDO----");
                        System.out.println("Informe o número do pedido: ");
                        int numero = sc.nextInt();
                        sc.nextLine();
                        pedidos.remove(numero);
                        unidade.remove(numero);
                        valor.remove(numero);

                        System.out.println("Pedido removido com sucesso!");
                        break;

                    case 5:
                        System.out.println("Encerrando o programa...");
                        return;
                }
            }
        }
    }

