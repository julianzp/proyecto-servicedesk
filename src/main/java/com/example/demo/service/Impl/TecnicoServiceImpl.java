package com.example.demo.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Clientes;
import com.example.demo.entity.Tecnico;
import com.example.demo.repository.TecnicoRepository;
import com.example.demo.service.TecnicoService;

@Service("tecnicoservice")
public class TecnicoServiceImpl implements TecnicoService {

	@Autowired
	@Qualifier("tecnicorepository")
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
    private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public Tecnico addTecnico(Tecnico tecnico) {
		
		
		
		tecnico.setPassword(passwordEncoder.encode(tecnico.getPassword()));
		return tecnicoRepository.save(tecnico);
	}

	@Override
	public List<Tecnico> ListAllTecnico() {
		
		List<Tecnico> users = new ArrayList<>();
		
		users = tecnicoRepository.findAll();
		
		return users;
	}

	
	@Override
	public Tecnico findTecnicoByidTecnico(long idTecnico) {
		return tecnicoRepository.findByidTecnico(idTecnico) ;
	}

	@Override
	public void deleteTecnico(long idTecnico) {
		
		Tecnico tec = findTecnicoByidTecnico(idTecnico);
		
		if(null != tec) {
			tecnicoRepository.delete(tec);
		}
	}




	}

	

	


