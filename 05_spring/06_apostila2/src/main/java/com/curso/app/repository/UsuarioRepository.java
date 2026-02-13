package com.curso.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Usuario findByLogin(String login);
}
