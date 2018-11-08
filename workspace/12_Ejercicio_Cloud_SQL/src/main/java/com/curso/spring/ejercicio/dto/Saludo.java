package com.curso.spring.ejercicio.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Saludo {

	private String prefijo;
	private String sufijo;
	@Id
	private String idioma;
	
	public String getPrefijo() {
		return prefijo;
	}
	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}
	public String getSufijo() {
		return sufijo;
	}
	public void setSufijo(String sufijo) {
		this.sufijo = sufijo;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Saludo(String prefijo, String sufijo, String idioma) {
		super();
		this.prefijo = prefijo;
		this.sufijo = sufijo;
		this.idioma = idioma;
	}
	public Saludo() {
		super();
	}
}
