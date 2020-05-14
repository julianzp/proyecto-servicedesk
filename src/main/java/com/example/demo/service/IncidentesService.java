package com.example.demo.service;



import java.util.List;


import com.example.demo.entity.Incidentes;
import com.example.demo.entity.Tecnico;

public interface IncidentesService {

public abstract Incidentes addIncidentes(Incidentes incidentes);
	
public abstract List<Incidentes> ListAllIncidentes();

public abstract List<Incidentes> ListAllIncidentesByTecnico();

public abstract Incidentes findIncidentesByidInci(int idInci);

	/*
	 * public abstract Incidentes findEstadoInci(String string);
	 */
public abstract void deleteIncidentes(int idInci);





	
	
	
}
