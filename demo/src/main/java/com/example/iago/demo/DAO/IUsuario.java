package com.example.iago.demo.DAO;

import com.example.iago.demo.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuario extends JpaRepository<Usuario, Integer> {
}
