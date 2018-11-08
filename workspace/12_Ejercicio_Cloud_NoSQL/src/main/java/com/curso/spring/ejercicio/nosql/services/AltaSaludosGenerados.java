package com.curso.spring.ejercicio.nosql.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.curso.spring.ejercicio.nosql.entities.ComposicionSaludo;
import com.curso.spring.ejercicio.nosql.persistence.SaludoMongoRepository;

@Service
public class AltaSaludosGenerados {
	
	@Autowired
	private SaludoMongoRepository repositorioSaludoMongo;
	
	public void receiveMessage(String message) {
		repositorioSaludoMongo.save(new ComposicionSaludo(message, message));
	}
	
	public List<String> consultarTodosLosSaludosGenerados() {

		List<ComposicionSaludo> saludos = repositorioSaludoMongo.findAll();
		
		Stream<String> map = saludos.stream().map(
				(dato) ->  {return dato.getSaludo();});
		
		return map.collect(Collectors.toList());
	}
}
