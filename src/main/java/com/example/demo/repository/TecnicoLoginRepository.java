package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tecnico;

@Repository
public interface TecnicoLoginRepository extends CrudRepository<Tecnico, Long> {
	
	Tecnico findByUsername(String username);
}
