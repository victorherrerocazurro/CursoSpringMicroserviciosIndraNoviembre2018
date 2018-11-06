package com.curso.spring.data.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

	@Id
	private String id;

	private String nombre;
	
	public Persona() {
		super();
	}

	public Persona(String id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
}
