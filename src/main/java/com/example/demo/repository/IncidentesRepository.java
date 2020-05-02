package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Incidentes;

@Repository("incidentesrepository")
public interface IncidentesRepository extends JpaRepository<Incidentes, Serializable>{

	
	public abstract Incidentes findByidInci(int idInci);
}
