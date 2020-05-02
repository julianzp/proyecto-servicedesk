/**
 * 
 */
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Incidentes;
import com.example.demo.entity.Tecnico;
import com.example.demo.service.IncidentesService;
import com.example.demo.service.TecnicoListarService;

/**
 * @author Admin
 *
 */
@Controller
@RequestMapping("/incidentes")
public class IncidentesController {

	@Autowired
	@Qualifier("incidentesservice")
	private IncidentesService incidentesService;
	
	@Autowired
	private TecnicoListarService tecnicoListarService;

	@PostMapping("/addincidentes")
	public String addClientes(@ModelAttribute(name = "incidentes") Incidentes incidentes, Model model) {

		incidentesService.addIncidentes(incidentes);
		return "redirect:/incidentes/reportes?idInci=0";
	}
	
	@GetMapping("/addlistatecnico")
	public String addListaTecnico(Model model) {

		// Clientes cliente = new Clientes();
		//Tecnico tecnico = new Tecnico();
		Incidentes incidentes1 = new Incidentes();
		List<Tecnico> listaTecnico = tecnicoListarService.listaTecnicos();
		
		model.addAttribute("incidentes1", incidentes1);
		model.addAttribute("listaTecnico", listaTecnico);

		return "reportes1";
	}

	
	
	@GetMapping("/reportes")
	public String showReportes(Model model , @RequestParam(name = "idInci", required = true) int idInci ) {

		Incidentes inci = new Incidentes();
		List<Tecnico> listaTecnico = tecnicoListarService.listaTecnicos();
		
		  if (idInci != 0) { 
			  inci = incidentesService.findIncidentesByidInci(idInci); 
			  
			  model.addAttribute("incidentes1", inci);
				model.addAttribute("listaTecnico", listaTecnico);
			  model.addAttribute("incidentes", inci);
			  return "reportes1";
			  }
		 

		model.addAttribute("incidentes", inci);
		return "reportes";
	}

	@GetMapping("/listadoincidentes")
	public ModelAndView ListadoIncidentes() {

		ModelAndView mav = new ModelAndView("incidentesLista");
		mav.addObject("incidentesLista", incidentesService.ListAllIncidentes());
		return mav;
	}
	

	
	

	@GetMapping("/deleteincidentes")
	public ModelAndView deleteIncidentes(@RequestParam(name = "idInci", required = true) int idInci) {

		incidentesService.deleteIncidentes(idInci);

		return ListadoIncidentes();
	}

	@PostMapping("/volver")
	public String volver() {
		return "redirect:/incidentes/listadoincidentes";

	}

}