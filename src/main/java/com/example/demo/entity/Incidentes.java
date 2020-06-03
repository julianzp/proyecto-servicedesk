package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import java.util.Calendar;
import com.example.demo.entity.Tecnico;

@Entity
@Table(name = "incidentes")
public class Incidentes {

	
	@Id
	@GeneratedValue
	@Column(name = "idInci")
	private int idInci;

	@Column(name = "docInci")
	private int docInci;
	
	@Column(name = "nombreInci")
	private String nombreInci;

	@Column(name = "tipoInci")
	private String tipoInci;

    
	@Column(name = "telefonoInci")
	private int telefonoInci;
	
	
	  @Column(name = "emailInci") 
	  private String emailInci;
	 
	  private long fechaInci;
	 
	//= System.currentTimeMillis();
	//java.sql.Timestamp timestamp = new java.sql.Timestamp(time);
	
	//private Calendar fechaInci;
	
	
	@Column(name = "descripcionInci")
	private String descripcionInci;
	
	@Column(name = "callCenterDescripInci")
	private String callCenterDescripInci;
	
	@Column(name = "descripSolucionInci")
	private String descripSolucionInci;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name= "tecnico")
	private Tecnico tecnico;
	
	@Column(name = "estadoInci")
	private String estadoInci;



	public int getIdInci() {
		return idInci;
	}


	public void setIdInci(int idInci) {
		this.idInci = idInci;
	}

	

	public int getDocInci() {
		return docInci;
	}


	public void setDocInci(int docInci) {
		this.docInci = docInci;
	}


	public String getNombreInci() {
		return nombreInci;
	}


	public void setNombreInci(String nombreInci) {
		this.nombreInci = nombreInci;
	}


	public String getTipoInci() {
		return tipoInci;
	}


	public void setTipoInci(String tipoInci) {
		this.tipoInci = tipoInci;
	}


	public int getTelefonoInci() {
		return telefonoInci;
	}


	public void setTelefonoInci(int telefonoInci) {
		this.telefonoInci = telefonoInci;
	}


	public String getEmailInci() {
		return emailInci;
	}


	public void setEmailInci(String emailInci) {
		this.emailInci = emailInci;
	}

	
	public long getfechaInci() {
		return fechaInci;
	}
	public void setfechaInci(long timestamp) {
		this.fechaInci = timestamp;
	}
	
	public String getDescripcionInci() {
		return descripcionInci;
	}


	public void setDescripcionInci(String descripcionInci) {
		this.descripcionInci = descripcionInci;
	}

	
	

	
	public String getCallCenterDescripInci() {
		return callCenterDescripInci;
	}


	public void setCallCenterDescripInci(String callCenterDescripInci) {
		this.callCenterDescripInci = callCenterDescripInci;
	}


	public String getDescripSolucionInci() {
		return descripSolucionInci;
	}


	public void setDescripSolucionInci(String descripSolucionInci) {
		this.descripSolucionInci = descripSolucionInci;
	}


	public Tecnico getTecnico() {
		return tecnico;
	}


	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	
	


	
	
	public String getEstadoInci() {
		return estadoInci;
	}


	public void setEstadoInci(String estadoInci) {
		this.estadoInci = estadoInci;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idInci;
		result = prime * result + ((tecnico == null) ? 0 : tecnico.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidentes other = (Incidentes) obj;
		if (idInci != other.idInci)
			return false;
		if (tecnico == null) {
			if (other.tecnico != null)
				return false;
		} else if (!tecnico.equals(other.tecnico))
			return false;
		return true;
	}





	public Incidentes(int idInci, int docInci, String nombreInci, String tipoInci, int telefonoInci, String emailInci,
			long fechaInci, String descripcionInci, String callCenterDescripInci, String descripSolucionInci,
			Tecnico tecnico, String estadoInci) {
		super();
		this.idInci = idInci;
		this.docInci = docInci;
		this.nombreInci = nombreInci;
		this.tipoInci = tipoInci;
		this.telefonoInci = telefonoInci;
		this.emailInci = emailInci;
		this.fechaInci = fechaInci;
		this.descripcionInci = descripcionInci;
		this.callCenterDescripInci = callCenterDescripInci;
		this.descripSolucionInci = descripSolucionInci;
		this.tecnico = tecnico;
		this.estadoInci = estadoInci;
	}


	public Incidentes() {
		
	}


	
	
}
