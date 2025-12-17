package org.example.entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            System.out.println("----MENU DE OPÇÕES-----");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Atualizar o cadastro do Aluno");
            System.out.println("4 - Remover Aluno");
            System.out.println("5 - Sair do Programa");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1 -> {
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a primeira nota: ");
                    double nota = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite a segunda nota: ");
                    double nota2 = sc.nextInt();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.cadastrarAluno(aluno);
                }
                case 2 -> {
                    System.out.println("||----LISTA DE ALUNOS-----||");
                    gerenciarAlunos.listarAlunos();
                }
                case 3 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.println("Digite o id do aluno que deseja atualizar: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o nome do aluno que deseja atualizar: ");
                    String nomeNovo = sc.nextLine();

                    System.out.print("Digite a primeira nota: ");
                    double notaNovo = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Digite a segunda nota: ");
                    double nota2Novo = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nomeNovo, notaNovo, nota2Novo);
                    gerenciarAlunos.alterarAluno(id, nomeNovo, notaNovo, nota2Novo);

                }
                case 4 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.println("Digite o id do aluno que deseja remover: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    gerenciarAlunos.excluirAluno(id);
                }
                case 5 -> {
                    System.out.println("Finalizando o programa...");
                    return;
                }
            }
        }
    }
}
