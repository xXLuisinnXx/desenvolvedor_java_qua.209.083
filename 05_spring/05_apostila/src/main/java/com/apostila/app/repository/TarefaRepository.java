package com.apostila.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apostila.app.models.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, String>{

}
