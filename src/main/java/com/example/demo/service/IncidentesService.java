package com.example.demo.service;



import java.util.List;


import com.example.demo.entity.Incidentes;

public interface IncidentesService {

public abstract Incidentes addIncidentes(Incidentes incidentes);
	
public abstract List<Incidentes> ListAllIncidentes();


public abstract Incidentes findIncidentesByidInci(int idInci);

public abstract void deleteIncidentes(int idInci);



	
	
	
}
