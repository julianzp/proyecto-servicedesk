package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity

public class Escalonada {

	@Id
	private Boolean estaEscalonada;

	public Boolean getEstaEscalonada() {
		return estaEscalonada;
	}

	public void setEstaEscalonada(Boolean estaEscalonada) {
		this.estaEscalonada = estaEscalonada;
	}

	public Escalonada(Boolean estaEscalonada) {
		super();
		this.estaEscalonada = estaEscalonada;
	}
	
	
}
