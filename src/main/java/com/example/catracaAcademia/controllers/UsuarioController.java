package com.example.catracaAcademia.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario") // Define o prefixo base para todas as rotas deste controlador
public class UsuarioController {

    
    @GetMapping("/findbyname")
    public String getUsuario(@RequestParam(value = "name") String name) {
        return "Olá, usuário: " + name + "Seja bem-vindo!";
    }

   
    @GetMapping("/get/{id}")
    public String getUsuarioById(@PathVariable String id) {
        return "Usuário com ID: " + id;
    }
}