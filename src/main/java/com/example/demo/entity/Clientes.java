package com.example.demo.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.Table;


import java.lang.String;

@Entity
@Table(name = "clientes")


public class Clientes {

	

	public static String encoder(String foto642) {
		String base64Image = "";
		File file = new File("C:\\Users\\Admin\\Pictures\\base64\\" + foto642);
		try (FileInputStream imageInFile = new FileInputStream(file)) {
			byte imageData[] = new byte[(int) file.length()];
			imageInFile.read(imageData);
			base64Image = Base64.getEncoder().encodeToString(imageData);
		} catch (FileNotFoundException e) {
			System.out.println("La imagen no funciona: " + e);
		} catch (IOException ioe) {
			System.out.println("Excepción al leer la imagen.: " + ioe);
		}

		return base64Image;
	}

	@Id
	@GeneratedValue
	@Column(name = "idCli")
	private int idCli;

	@Column(name = "docCli", unique = true, nullable = false)
	private String docCli;

	@Column(name = "nombreCli", nullable = false)
	private String nombreCli;

	@Column(name = "apellidoCli", nullable = false)
	private String apellidoCli;

	@Column(name = "tipoDocCli")
	private String tipoDocCli;

    
	@Column(name = "ciudadCli", nullable = false)
	private String ciudadCli;
	

	
	//columnDefinition = "ALTER TABLE clientes ALTER COLUMN foto64 TEXT"
	@Column(name = "foto64", columnDefinition = "TEXT", nullable = false )
	private String foto64;
	
	//@Column(columnDefinition = "ALTER TABLE clientes ALTER COLUMN foto64 TEXT" )
	

	public int getIdCli() {
		return idCli;
	}

	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}

	public String getDocCli() {
		return docCli;
	}

	public void setDocCli(String docCli) {
		this.docCli = docCli;
	}

	public String getNombreCli() {
		return nombreCli;
	}

	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}

	public String getApellidoCli() {
		return apellidoCli;
	}

	public void setApellidoCli(String apellidoCli) {
		this.apellidoCli = apellidoCli;
	}

	public String getTipoDocCli() {
		return tipoDocCli;
	}

	public void setTipoDocCli(String tipoDocCli) {
		this.tipoDocCli = tipoDocCli;
	}

	



	public String getCiudadCli() {
		return ciudadCli;
	}

	public void setCiudadCli(String ciudadCli) {
		this.ciudadCli = ciudadCli;
	}

	public String getFoto64() {
		return foto64;
	}

	public void setFoto64(String foto64) {
		this.foto64 = "data:image/jpeg;base64," + encoder(foto64);	
	}

	public Clientes(int idCli, String docCli, String nombreCli, String apellidoCli, String tipoDocCli , String ciudadCli,
			String foto64) {
		super();
		this.idCli = idCli;
		this.docCli = docCli;
		this.nombreCli = nombreCli;
		this.apellidoCli = apellidoCli;
		this.tipoDocCli = tipoDocCli;
		this.ciudadCli = ciudadCli;
		this.foto64 = foto64;
	}

	public Clientes() {

	}

}
