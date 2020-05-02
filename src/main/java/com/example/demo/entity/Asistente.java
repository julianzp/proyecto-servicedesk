package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Asistente {


	
	@Id
	@GeneratedValue
	@Column(name = "idAsistente")
	private long idAsistente;
	@Column
	private String username;

	@Column
	private String password;
	
	

	public Asistente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Asistente(String username2, String password2) {
		
		this.username = username2;
		this.password = password2;
	}

	public long getIdAsistente() {
		return idAsistente;
	}

	public void setIdAsistente(long idAsistente) {
		this.idAsistente = idAsistente;
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

	
	
	/*
	 * public Asistente(long idAsistente, String username, String password) {
	 * super(); this.idAsistente = idAsistente; this.username = username;
	 * this.password = password; }
	 */

	/*
	 * public Asistente(String username2, String password2) {
	 * 
	 * this.username = username2; this.password = password2; }
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idAsistente ^ (idAsistente >>> 32));
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
		Asistente other = (Asistente) obj;
		if (idAsistente != other.idAsistente)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Asistente [idAsistente=" + idAsistente + ", username=" + username + ", password=" + password + "]";
	}
	
	
	
	
	
	
	
}
