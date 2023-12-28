package com.example.iago.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome", nullable = true, length = 200)
    private String name;
    @Column(name = "email", nullable = true, length = 50, unique = true)
    private String email;
    @Column(name = "senha", nullable = true)
    private String senha;
    @Column(name = "telefone", nullable = true, length = 15)
    private String telefone;

    public Usuario() {

    }

    public Usuario(Integer id, String name, String email, String senha, String telefone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
