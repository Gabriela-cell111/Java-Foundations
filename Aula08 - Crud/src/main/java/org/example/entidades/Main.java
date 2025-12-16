package org.example.entidades;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();
        Aluno aluno1 = new Aluno("Gabriela" , 10 , 10);

        gerenciarAlunos.cadastrarAluno(aluno1);




    }
}
