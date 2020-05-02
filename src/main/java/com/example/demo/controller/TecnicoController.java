package com.example.demo.controller;



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

import com.example.demo.entity.Tecnico;
import com.example.demo.service.TecnicoListarService;
import com.example.demo.service.TecnicoService;

@Controller
@RequestMapping("/tecnico")

public class TecnicoController {

	@Autowired
	@Qualifier("tecnicoservice")
	private TecnicoService tecnicoService;
		
	@GetMapping("/usersform")
	public String Usersform(Model model, @RequestParam(name = "idTecnico" , required = true) int idTecnico) {

		Tecnico tec = new Tecnico();
		
		

		if (idTecnico != 0) {
			tec = tecnicoService.findTecnicoByidTecnico(idTecnico);
		}

		model.addAttribute("tecnico", tec);
		return "usersform";
	}

	@PostMapping("/addtecnico")
	public String addTecnico(@ModelAttribute(name = "tecnico") Tecnico tecnico, Model model) {
		

		tecnicoService.addTecnico(tecnico);
		return "redirect:/tecnico/listadotecnico";
	}
	
	@GetMapping("/listadotecnico")
	public ModelAndView ListadoTecnico() {

		ModelAndView mav = new ModelAndView("users");
		mav.addObject("users", tecnicoService.ListAllTecnico());
		return mav;
	}

	@GetMapping("/deletetecnico")
	public ModelAndView deleteTecnico(@RequestParam(name = "idTecnico", required = true) int idTecnico) {

		tecnicoService.deleteTecnico(idTecnico);

		return ListadoTecnico();
	}
	
	@PostMapping("/volver")
	public String volver() {
		return "redirect:/tecnico/listadotecnico";
		
	}
	
	

}
