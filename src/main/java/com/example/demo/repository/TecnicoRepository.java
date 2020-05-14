package com.example.demo.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Tecnico;

@Repository("tecnicorepository")
public interface TecnicoRepository extends JpaRepository<Tecnico, Serializable>{
	
	public abstract Tecnico findByidTecnico(long idTecnico);
	
	
	
	
}
