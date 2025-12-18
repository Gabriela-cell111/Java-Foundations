package com.example.lojaroupa.controller;


import com.example.lojaroupa.model.DadosRoupa;
import com.example.lojaroupa.model.Roupa;
import com.example.lojaroupa.model.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @Autowired
    private RoupaRepository roupaRepository;



   @PostMapping
    public void cadastrarRoupa(@RequestBody DadosRoupa dadosRoupa){
       roupaRepository.save(new Roupa(dadosRoupa));
   }

   @GetMapping
    public List<Roupa> listarRoupas(){
        return roupaRepository.findAll();
    }

    @DeleteMapping
    public void deletarRoupa(@RequestParam int id){
       roupaRepository.delete(new Roupa());
    }
    



}
