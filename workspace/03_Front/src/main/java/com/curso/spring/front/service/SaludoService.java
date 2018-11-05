package com.curso.spring.front.service;

import com.curso.spring.front.dto.Saludo;

//representa requisitos funcionales a cubrir por la aplicacion
public interface SaludoService {

	void altaSaludo(Saludo saludo);
	
	void bajaSaludo(String id);
	
	Saludo calculoSaludo();

}
