package variaveis;
import java.util.Scanner;

public class EntradaDados{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //Metodo Next, para capturar a palavra digitada pelo usuário
    System.out.println("Digite seu nome:");
    String nome = sc.next();
    sc.nextLine();
    System.out.println(nome);

    // Metodo NextLine - capturar a linha digitada pelo usuário
    System.out.println("Digite seu nome:");
    String nomeCompleto = sc.nextLine();
    sc.next();
    System.out.println(nomeCompleto);
    sc.close();


    }

}

