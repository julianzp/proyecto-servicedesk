package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Incidentes;
import com.example.demo.entity.Tecnico;

@Repository("incidentesrepository")
public interface IncidentesRepository extends JpaRepository<Incidentes, Serializable>{
	
	public abstract Incidentes findByidInci(int idInci);
	
	public abstract Incidentes findByTecnico(Incidentes tecnico);
	
	/*
	 * public abstract Incidentes findByEstadoInci(String estadoInci);
	 */

	//public abstract List<Incidentes> findAllById(Tecnico tecnico);
	
}
