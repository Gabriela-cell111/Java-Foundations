package org.example;

import org.example.entidades.GerenciarRoupa;
import org.example.entidades.Roupa;

import java.sql.SQLException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args){
        GerenciarRoupa gerenciarRoupa = new GerenciarRoupa();
        Roupa roupa = new Roupa("Vans", "Meias", "M", 50, 25.99);

//        gerenciarRoupa.cadastrarRoupa(roupa);
//        gerenciarRoupa.excluirRoupa(1);
//        gerenciarRoupa.alterarRoupa(2 , "Vans", "Bermuda", "G", 90, 89.99);
          gerenciarRoupa.listarRoupa();
    }
}
