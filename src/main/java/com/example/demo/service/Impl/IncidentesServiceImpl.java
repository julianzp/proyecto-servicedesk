/**
 * 
 */
package com.example.demo.service.Impl;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Clientes;
import com.example.demo.entity.Incidentes;
import com.example.demo.entity.Tecnico;
import com.example.demo.repository.IncidentesRepository;
import com.example.demo.service.IncidentesService;

/**
 * @author Admin
 *
 */

@Service("incidentesservice")
public class IncidentesServiceImpl implements IncidentesService {

	@Autowired
	@Qualifier("incidentesrepository")
	private IncidentesRepository IncidentesRepository;

	@Override

	public Incidentes addIncidentes(Incidentes incidentes) {

		incidentes.setfechaInci(System.currentTimeMillis());
		return IncidentesRepository.save(incidentes);
	}

	@Override
	public List<Incidentes> ListAllIncidentes() {

		List<Incidentes> incidentesLista = new ArrayList<>();

		incidentesLista = IncidentesRepository.findAll();

		return incidentesLista;
	}

	@Override
	public Incidentes findIncidentesByidInci(int idInci) {

		return IncidentesRepository.findByidInci(idInci);
	}

	@Override
	public void deleteIncidentes(int idInci) {

		Incidentes inci = findIncidentesByidInci(idInci);

		if (null != inci) {
			IncidentesRepository.delete(inci);
		}
	}

	/*
	@Override
	public List<Incidentes> ListAllIncidentesByTecnico(Tecnico tecnico) {
		// TODO Auto-generated method stub
		return null;
	}
	*/

	
	@Override
	public List<Incidentes> ListAllIncidentesByTecnico() {
	


		List<Incidentes> incidentesTecnico = new ArrayList<>();

		incidentesTecnico = IncidentesRepository.findAll();

		return incidentesTecnico;

				
	}

	/*
	 * @Override public Incidentes findEstadoInci(String estadoInci) { // TODO
	 * Auto-generated method stub return
	 * IncidentesRepository.findByEstadoInci(estadoInci); }
	 */


	/*
	 * private Incidentes findByTecnico(Tecnico tecnico) {
	 * 
	 * return IncidentesRepository.findByTecnico(tecnico); }
	 */

}
