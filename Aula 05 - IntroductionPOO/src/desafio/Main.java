package desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            Produto cadastro = new Produto();
            System.out.print("Digite o nome do produto: ");
            cadastro.nome = sc.nextLine();

            System.out.print("Digite o valor do produto: ");
            cadastro.valor = sc.nextDouble();
            sc.nextLine();

            System.out.print("Digite a quantidade do produto: ");
            cadastro.quantidade = sc.nextDouble();
            sc.nextLine();

            System.out.println("");
            System.out.println("----ESTOQUE----");
            System.out.println("Produto: " + cadastro.nome);
            System.out.println("Valor: " + cadastro.valor);
            System.out.println("Quantidade: " + cadastro.quantidade);
            System.out.println("Total: " + cadastro.calcularTotal());





    }
}
