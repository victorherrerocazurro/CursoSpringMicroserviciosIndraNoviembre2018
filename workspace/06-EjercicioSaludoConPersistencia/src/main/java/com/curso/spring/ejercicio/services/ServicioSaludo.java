package com.curso.spring.ejercicio.services;

import java.util.List;

import com.curso.spring.ejercicio.dto.Saludo;

public interface ServicioSaludo {

	void altaSaludo(Saludo saludo);
	
	String calcularSaludo(String nombre, String idioma);
	
	List<String> consultarTodosLosSaludosGenerados();
	
}
