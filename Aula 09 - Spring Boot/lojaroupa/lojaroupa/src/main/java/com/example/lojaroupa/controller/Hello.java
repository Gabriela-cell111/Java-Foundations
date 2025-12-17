package com.example.lojaroupa.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Comunicação entre usuário e o banco de dados - Alusão: criamos o carteiro e garçom
@RequestMapping("/hello") //End point - IP: local host - Porta: 8080 - Local do controller: hello
public class Hello {

    //Simulando o método get - visualização
    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

}
