package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciarAlunos {

    //O caminho que percorre até o banco de dados
    //local host: próprio computador
    // Porta: 3306
    private final String url = "jdbc:mysql://localhost:3306/escola";
    private final String usuario = "root";
    private final String senha = "admin";  // altere


    // Método para conectar no banco de dados
    Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    //----Cadastrar aluno----//
    public void cadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos (nome, nota1, nota2) VALUES (?, ?, ?)";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setDouble(2, aluno.getNota());
            stmt.setDouble(3, aluno.getNota2());
            stmt.executeUpdate();
            System.out.println("Aluno cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //----Excluir aluno----//
    public void excluirAluno(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";
        Connection conexao = null;
        try {
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Aluno excluido com sucesso!");
            conexao = conectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
