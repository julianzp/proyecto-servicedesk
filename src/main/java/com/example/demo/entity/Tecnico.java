package com.example.demo.entity;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import com.example.demo.entity.Incidentes;

@Entity
public class Tecnico {
	
	public Tecnico() {
		
	}
	
	
	@Column
	private String username;

	@Column
	private String password;
	
	@Column
	private String nombreTecnico;
	
	@Column
	private String apellidosTecnico;
	
	@Column
	private String docTecnico;

	
	@Id
	@GeneratedValue
	@Column(name = "idTecnico")
	private long idTecnico;
	
	@Column
	private String especialidad;
	
	@OneToMany(mappedBy = "tecnico", cascade = CascadeType.ALL)
	//@JoinColumn(name = "idIncidente")
	List<Incidentes> incidentes = new ArrayList<>();
	

	
	@OneToOne
	@JoinColumn(name = "id_esta_escalonada")
    private Escalonada escalonada;
	

	public long getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(long idTecnico) {
		this.idTecnico = idTecnico;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	


	public Escalonada getEscalonada() {
		return escalonada;
	}

	public void setEscalonada(Escalonada escalonada) {
		this.escalonada = escalonada;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
}
	
	
	

	

	public List<Incidentes> getIncidentes() {
		return incidentes;
	}

	public void setIncidentes(List<Incidentes> incidentes) {
		this.incidentes = incidentes;
	}

	public String getNombreTecnico() {
		return nombreTecnico;
	}

	public void setNombreTecnico(String nombreTecnico) {
		this.nombreTecnico = nombreTecnico;
	}

	public String getApellidosTecnico() {
		return apellidosTecnico;
	}

	public void setApellidosTecnico(String apellidosTecnico) {
		this.apellidosTecnico = apellidosTecnico;
	}

	public String getDocTecnico() {
		return docTecnico;
	}

	public void setDocTecnico(String docTecnico) {
		this.docTecnico = docTecnico;
	}

	public Tecnico(String username, String password, String nombreTecnico, String apellidosTecnico, String docTecnico,
			long idTecnico, String especialidad, List<Incidentes> incidentes, Escalonada escalonada) {
		super();
		this.username = username;
		this.password = password;
		this.nombreTecnico = nombreTecnico;
		this.apellidosTecnico = apellidosTecnico;
		this.docTecnico = docTecnico;
		this.idTecnico = idTecnico;
		this.especialidad = especialidad;
		this.incidentes = incidentes;
		this.escalonada = escalonada;
	}

	/*
	 * public Tecnico(String username2, String password2) {
	 * 
	 * this.username = username2; this.password = password2; }
	 */



	@Override
	public String toString() {
		return "Tecnico [username=" + username + ", password=" + password + ", nombreTecnico=" + nombreTecnico
				+ ", apellidosTecnico=" + apellidosTecnico + ", docTecnico=" + docTecnico + ", idTecnico=" + idTecnico
				+ ", especialidad=" + especialidad + ", incidentes=" + incidentes + ", escalonada=" + escalonada + "]";
	}
	
	


	




	
	
	
	
}
