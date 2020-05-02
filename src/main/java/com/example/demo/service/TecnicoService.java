package com.example.demo.service;



import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.entity.Tecnico;



public interface TecnicoService {

	public abstract Tecnico addTecnico(Tecnico tecnico);
	
	public abstract List<Tecnico> ListAllTecnico();
	
	
	public abstract Tecnico findTecnicoByidTecnico(long idTecnico);
	
	public abstract void deleteTecnico(long idTecnico);

		
		
		
}

