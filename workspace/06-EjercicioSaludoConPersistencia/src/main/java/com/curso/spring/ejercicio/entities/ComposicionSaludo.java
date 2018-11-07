package com.curso.spring.ejercicio.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class ComposicionSaludo {
	@Id
	private String id;

	@Field
	private String saludo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	public ComposicionSaludo(String id, String saludo) {
		super();
		this.id = id;
		this.saludo = saludo;
	}

	public ComposicionSaludo() {
		super();
	}
}
