package com.example.lojaroupa.model;

import jakarta.persistence.*;
import lombok.*;


// Informa qual tabela se relaciona a entidade
@Table(name = "roupa" )

// Informa que a classe Roupa é uma entidade JPA
// Mapea  a Classe para o banco
@Entity(name = "Roupa")
// Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String marca;
   private String tipo;
   private String tamanho;
   private int quantidade;
   private double preco;


}
