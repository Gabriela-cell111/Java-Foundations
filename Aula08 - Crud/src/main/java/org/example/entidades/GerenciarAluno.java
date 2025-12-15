package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciarAluno {
    private final String URL = "jdbc:mysql://localhost:3306/escola";
    private final String USER = "root";
    private final String PASS = "";  // altere

    // Método para conectar
    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // -----------------------------
    // 1. ADICIONAR ALUNO
    // -----------------------------
    
}
