package com.example.iago.demo.controller;

import com.example.iago.demo.DAO.IUsuario;
import com.example.iago.demo.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    private IUsuario dao;

    @Autowired
    public UsuarioController(IUsuario dao) {
        this.dao = dao;
    }
    @GetMapping("/test")
    public List<Usuario> getUsers() {
        return dao.findAll();
    }
}
