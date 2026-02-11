package com.login.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.login.app.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
    
}
