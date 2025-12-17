package org.example.entidades;

import java.sql.*;

public class GerenciarRoupa {
    private final String url = "jdbc:mysql://localhost:3306/roupa";
    private final String usuario = "root";
    private final String senha = "admin";

    // Método para conectar no banco de dados\\
    Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    // Cadastro \\

    public void cadastrarRoupa (Roupa roupa) {
        String sql = "INSERT INTO roupa (marca, tipo, tamanho , quantidade , valor) " +
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

    //Excluir produto\\
    public void excluirRoupa(int id) {
        String sql = "DELETE FROM roupa WHERE id = ?";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Produto excluido com sucesso!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //Atualizar cadastro do produto\\
    public void alterarRoupa(int id, String marca, String tipo, String tamanho, int quantidade, double valor) {
        String sql = "UPDATE roupa SET marca = ? , tipo = ? , tamanho = ?, quantidade = ? ,valor = ? WHERE id = ?";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setString(2, tipo);
            stmt.setString(3, tamanho);
            stmt.setInt(4, quantidade);
            stmt.setDouble(5, valor);
            stmt.setInt(6, id);
            stmt.executeUpdate();
            System.out.println("Alterado com sucesso!");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    //-----Listar produtos----\\
    public void listarRoupa() {
        String sql = "SELECT * FROM roupa";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println(" | " + rs.getInt("id") + " | " +
                        rs.getString("marca") + " | " +
                        rs.getString("tipo") + " | " +
                        rs.getString("tamanho") + " | " +
                        rs.getDouble("quantidade") + " | " +
                        rs.getDouble("valor") + "| ");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
