package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudAvancado {
    public static void main(String[] args) {
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Integer> idadesAlunos = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao;

        while(true){
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
                //Cadsatrar
                case 1:
                    System.out.println("Digite o nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.println("Digite idade do aluno: ");
                    int idadeAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    double notaAluno = sc.nextDouble();

                    nomesAlunos.add(nomeAluno);
                    notasAlunos.add(notaAluno);
                    idadesAlunos.add(idadeAluno);
                    break;

                case 2:
                    System.out.println("\n----LISTA DE ALUNOS----");
                    for (int i = 0; i < idadesAlunos.size(); i++) {
                        System.out.println(i + " - Nome: " + nomesAlunos.get(i) +
                                " - Idade: " + idadesAlunos.get(i) +
                                " - Nota: " + notasAlunos.get(i));
                    }
                    break;

                case 3:
                    System.out.println("\n----ATUALIZAR O CADASTRO----");
                    System.out.println("Digite o id do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do aluno: ");
                    String novoNomeAluno = sc.nextLine();

                    System.out.println("Digite idade do aluno: ");
                    int novoIdadeAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a nota do aluno: ");
                    double novoNotaAluno = sc.nextDouble();

                    nomesAlunos.add(idAluno, novoNomeAluno);
                    notasAlunos.add(idAluno, novoNotaAluno);
                    idadesAlunos.add(idAluno, novoIdadeAluno);

                    System.out.println("ATUALIZAÇÃO REALIZADA!");

                    break;

                case 4:
                    System.out.println("\n----EXCLUIR O CADASTRO----");
                    System.out.println("Digite o id do aluno: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();

                    nomesAlunos.remove(idRemover);
                    notasAlunos.remove(idRemover);
                    idadesAlunos.remove(idRemover);
                    break;

                case 5:
                    System.out.println("PROGRAMA ENCERRADO");
                    return;
            }
        }
    }
}
