package com.curso.spring.ejercicio.services.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.ejercicio.nosql.services.AltaSaludosGenerados;

@RestController
public class WebServiceRestSaludosGenerados {

	@Autowired
	private AltaSaludosGenerados servicio;

	@GetMapping
	public ResponseEntity<List<String>> consultarTodosLosSaludosGenerados(){
		List<String> saludosGenerados = servicio.consultarTodosLosSaludosGenerados();
		return new ResponseEntity<List<String>>(saludosGenerados,HttpStatus.OK);
	}

}
