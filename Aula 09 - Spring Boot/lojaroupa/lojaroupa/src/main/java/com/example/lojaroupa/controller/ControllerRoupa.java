package com.example.lojaroupa.controller;


import org.springframework.web.bind.annotation.*;
// Controller - Responsável por receber as requisições em HTTP;
// Rest - API Rest;

// Funcionamento do REST - Utiliza um metodo HTTP para definir ações:
// Metodo GET - Busca dados;
// Metodo POST - Criar dados;
// Metodo PUT - Atualizar dados;
// Metodo DELET - Remover dados.

@RestController
// Define a URL do CONTROLLER
// Nosso Controller terá o seguinte endpoint
// https://localhost:8080/roupas
@RequestMapping("/roupas")
@CrossOrigin(origins = "*")
public class ControllerRoupa {
   @PostMapping
    public void cadastrarRoupa(@RequestBody String roupa){
       System.out.println(roupa);
       //Body vai capturar a requisição


   }

}
