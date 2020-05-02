package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Tecnico;
import com.example.demo.repository.TecnicoListarRepository;
import com.example.demo.service.TecnicoListarService;

@Service
public class TecnicoListarServiceImpl implements TecnicoListarService {

	@Autowired
	private TecnicoListarRepository tecnicoListarRepository;
	
	@Override
	public List<Tecnico> listaTecnicos() {
		
		return (List<Tecnico>) tecnicoListarRepository.findAll();
	}

}
