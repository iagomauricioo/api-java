package com.example.iago.demo.controller;

import com.example.iago.demo.DAO.IUsuario;
import com.example.iago.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
    private IUsuario dao;

    @Autowired
    public UsuarioController(IUsuario dao) {
        this.dao = dao;
    }
    @GetMapping
    public ResponseEntity<List<Usuario>> getUsers() {
        List<Usuario> lista = dao.findAll();
        return ResponseEntity.status(200).body(lista);
    }

    @PostMapping
    public ResponseEntity<Usuario> postUser(@RequestBody  Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return ResponseEntity.status(201).body(usuarioNovo);
    }
    @PutMapping
    public ResponseEntity<Usuario> putUserById(@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return ResponseEntity.status(201).body(usuarioNovo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id) {
        dao.deleteById(id);
        return ResponseEntity.status(204).build(); //no content
    }
}
