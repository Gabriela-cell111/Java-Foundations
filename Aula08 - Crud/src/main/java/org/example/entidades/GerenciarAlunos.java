package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciarAlunos {

    //O caminho que percorre até o banco de dados
    //local host: próprio computador
    // Porta: 3306
    private final String url = "jdbc:mysql://localhost:3306/escola";
    private final String usuario = "root";
    private final String senha = "";  // altere


    // Método para conectar no banco de dados
    Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    //----Cadastrar aluno----//

}
