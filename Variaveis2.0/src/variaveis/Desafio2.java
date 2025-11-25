package variaveis;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {


        // Desafio 1 - Conversão de temperatura

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura (ºC):");
        double celsius = sc.nextDouble();
        double f = (celsius * 9/5) + 32;
        double k = celsius + 273.15;
        System.out.println("Temperatura em Fahrenheit: " + f + "ºF");
        System.out.println("Temperatura em Kelvin: " + k + "ºK");


        // Desafio 2 - Investimento
        System.out.println("Valor investido: ");
        double money = sc.nextDouble();

        System.out.println("Juros mensal: ");
        double juros = sc.nextDouble() / 100; // dividir por 100
        double total = 1 + juros;

        System.out.println("Tempo: ");
        double time = sc. nextDouble();

        double monte = money + Math.pow(total, time);
        System.out.println("O montante será: " + "R$" + String.format("%.2f", monte));


        // Desafio 3 - Média
        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Nota 3:");
        double nota3 = sc.nextDouble();

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println(" Média: " + String.format("%.2f" , media));


        //Desafio 4 Juro simples
        System.out.println("Valor investido: ");
        double dinheiro = sc.nextDouble();

        System.out.println("Tempo: ");
        int meses = sc.nextInt();

        System.out.println("Taxa:");
        double taxa = sc.nextDouble() / 100;
        double juroSimple = dinheiro * taxa * meses;
        double montante = juroSimple + dinheiro;
        System.out.println("O montante será: " + "R$" +String.format("%.2f" , montante));


        //Desafio 5 Área e Perímetro de um Círculo
        System.out.println(" Digite o raio:");
        double raio = sc.nextDouble();
        double perimetro = Math.PI * 2 * raio;
        double area = Math.PI * Math.pow( raio , 2);
        System.out.println(" O perimetro = " + String.format("%.2f",perimetro));
        System.out.printf(" A área = " + String.format("%.2f", area) + "%n");



        sc.close();






    }
}
