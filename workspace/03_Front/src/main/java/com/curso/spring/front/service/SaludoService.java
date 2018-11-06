package com.curso.spring.front.service;

import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;

import com.curso.spring.front.dto.Saludo;

//representa requisitos funcionales a cubrir por la aplicacion
public interface SaludoService {

	void altaSaludo(Saludo saludo) throws RestClientException, URISyntaxException;
	
	void bajaSaludo(String id);
	
	Saludo calculoSaludo() throws RestClientException, URISyntaxException;

}
