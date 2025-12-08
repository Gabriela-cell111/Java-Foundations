package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudSimples {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true) {
            System.out.println("SISTEMA DE ALUNOS");
            System.out.println("1 - Cadastrar alunos");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar o cadastro do aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Sair do programa");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o nome do aluno: ");
                    String nome = sc.nextLine();
                    lista.add(nome);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n----LISTA DE ALUNOS----");
                    if (lista.isEmpty()) {
                        System.out.println("NENHUM ALUNO ENCONTRADO!");
                    } else {
                        for (String aluno : lista) {
                            System.out.println(lista.indexOf(aluno) + "-" + aluno);
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n----ATUALIZAR O CADASTRO----");
                    System.out.println("Informe o id do aluno: ");
                    int id = sc.nextInt();
                    System.out.println("Informe o nome do aluno : ");
                    String nomeAluno = sc.nextLine();
                    lista.set(id,nomeAluno);
                    break;

                case 4:
                    System.out.println("\n----REMOVER O ALUNO----");
                    System.out.println("Informe o id do aluno: ");
                    int idAluno = sc.nextInt();
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    return;

            }
        }
    }
}
