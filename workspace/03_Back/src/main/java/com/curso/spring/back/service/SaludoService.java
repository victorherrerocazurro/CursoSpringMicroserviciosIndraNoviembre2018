package com.curso.spring.back.service;

import com.curso.spring.back.dto.Saludo;

//representa requisitos funcionales a cubrir por la aplicacion
public interface SaludoService {

	void altaSaludo(Saludo saludo);
	
	void bajaSaludo(String id);
	
	Saludo calculoSaludo();

}
