package com.example.catracaAcademia.controllers;

import com.example.catracaAcademia.model.Usuario;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/usuario") // Define o prefixo base para todas as rotas deste controlador
public class UsuarioController {
    
    private List<Usuario> usuarios = new ArrayList<>();

    @GetMapping("/findbyname")
    public String getUsuario(@RequestParam(value = "name") String name) {
        return "Olá, usuário: " + name + " Seja bem-vindo!";
    }

    @GetMapping("/get/{id}")
    public String getUsuarioById(@PathVariable String id) {
        return "Usuário com ID: " + id;
    }

    @PostMapping("/usuarios") // <-- Aqui garantimos que "/usuarios" existe
    public ResponseEntity<Usuario> inserirUsuario(@RequestBody @Valid Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário inserido com sucesso: " + usuario);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        return ResponseEntity.ok(usuarios);
    }
}
