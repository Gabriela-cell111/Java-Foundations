package exercicios;

import java.util.Scanner;

public class Desafio06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor gasto: ");
        double valor = sc.nextDouble();
        sc. nextLine();


        System.out.println(" 1 - Dinheiro / Pix"); // 10% de desconto
        System.out.println(" 2 - Débito ");        // 5 % de desconto
        System.out.println(" 3 - Crédito");       // A vista - 2x( 5% cada parcela) - 3x( 10% cada parcela
        System.out.println("Digite  método de pagamento: ");
        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                double desconto = valor * 0.9;
                System.out.println("Valor a ser pago R$:" + desconto);
                break;
            case 2:
                double desconto2 = valor * 0.95;
                System.out.println("Valor a ser pago R$:" + desconto2);
                sc.nextLine();
                break;
            case 3:
                System.out.println("Selecione o número de parcela:");
                System.out.println(" 1 - 1x");
                System.out.println(" 2 - 2x");
                System.out.println(" 3 - 3x");
                int parcela = sc.nextInt();

                switch (opcao){
                    case 1:
                        double total = valor;
                        System.out.println("Valor a ser pago R$:" + total);
                        break;
                    case 2:
                        double total2 = valor * 1.05 / 2 ;
                        System.out.println("Valor a ser pago R$:" + total2);
                        break;
                    case 3:
                        double total3 = valor * 1.1 / 3;
                        System.out.println("Valor a ser pago R$:" + total3);
                        break;
                        default:
                            System.out.println("Opção inválida");
                            break;

                }

             
        }
        sc.close();
    }
}
