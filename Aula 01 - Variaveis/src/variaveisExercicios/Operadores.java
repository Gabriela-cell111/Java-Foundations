package variaveis;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite um número: ");
        int numero2 = sc.nextInt();


        // Operador de soma (+)
        int soma = numero1 + numero2;
        System.out.println("A soma do" + numero1 + "+" + numero2 + "=" + soma);


        // Operador de subtração (-)
        int sub = numero1 / numero2;
        System.out.println("A subtração do " + numero1 + "-" + numero2 + "=" + sub);


        // Operador de multiplicação (*)
        int mult = numero1 * numero2;
        System.out.println("A multiplicação do " + numero1 + "x" + numero2 + "=" + mult);


        // Operador de divisão (/)
        double div = (double) numero1/ numero2;
        System.out.println("A divisão do " + numero1 + "/" + numero2 + "=" + div);


        //Operador modulo (%) - resto de uma divisão
        int modulo = numero1 % numero2;
        System.out.println("O modulo do " + numero1 + "%" + numero2 + "=" + modulo);



        // casting - converter o "TIPO"




        sc.close();

    }
}
