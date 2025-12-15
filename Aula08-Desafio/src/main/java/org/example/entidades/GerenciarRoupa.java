package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciarRoupa {

    //O caminho que percorre até o banco de dados
    //local host: próprio computador
    // Porta: 3306
    private final String url = "jdbc:mysql://localhost:3306/roupa";
    private final String usuario = "root";
    private final String senha = "admin";

    // Método para conectar no banco de dados
    Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }
    // Cadastramento:

    public void cadastrarRoupa (Roupa roupa) throws SQLException {
        String sql = "INSERT INTO loja (marca, tipo, tamanho , quantidade , valor) " +
                "VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, roupa.getMarca());
            stmt.setString(2, roupa.getTipo());
            stmt.setString(3, roupa.getTamanho());
            stmt.setInt(4, roupa.getQuantidade());
            stmt.setDouble(5, roupa.getValor());

            stmt.executeUpdate();
            System.out.println("Roupa cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }

    }

}
