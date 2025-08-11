package com.emiliano.tarefa_crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emiliano.tarefa_crud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
