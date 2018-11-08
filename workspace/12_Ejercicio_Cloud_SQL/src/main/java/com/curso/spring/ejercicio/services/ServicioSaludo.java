package com.curso.spring.ejercicio.services;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.web.client.RestClientException;

import com.curso.spring.ejercicio.dto.Saludo;

public interface ServicioSaludo {

	void altaSaludo(Saludo saludo);
	
	String calcularSaludo(String nombre, String idioma);
	
	List<String> consultarTodosLosSaludosGenerados() throws RestClientException, URISyntaxException;
	
}
