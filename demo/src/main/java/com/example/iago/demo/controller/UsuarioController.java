package com.example.iago.demo.controller;

import com.example.iago.demo.DAO.IUsuario;
import com.example.iago.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    private IUsuario dao;

    @Autowired
    public UsuarioController(IUsuario dao) {
        this.dao = dao;
    }
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> getUsers() {
        return ResponseEntity.ok(dao.findAll());
    }

    @PostMapping
    public ResponseEntity<Usuario> postUser(@RequestBody  Usuario usuario) {
        return ResponseEntity.ok(dao.save(usuario));
    }
    @PutMapping
    public ResponseEntity<Usuario> putUser(@PathVariable Usuario usuario) {
        return ResponseEntity.ok(dao.save(usuario));
    }
}
