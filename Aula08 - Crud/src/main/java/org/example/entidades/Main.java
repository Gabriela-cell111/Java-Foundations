package org.example.entidades;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos aluno = new GerenciarAlunos();
        try {
            aluno.conectar();
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
