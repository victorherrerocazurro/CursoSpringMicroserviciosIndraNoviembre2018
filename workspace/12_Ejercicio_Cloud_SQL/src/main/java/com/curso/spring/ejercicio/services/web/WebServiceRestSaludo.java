package com.curso.spring.ejercicio.services.web;

import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.curso.spring.ejercicio.dto.Saludo;
import com.curso.spring.ejercicio.services.ServicioSaludo;

@RestController
@RequestMapping("/saludos")
public class WebServiceRestSaludo {

	@Autowired
	private ServicioSaludo servicio;
	
	@PostMapping
	public ResponseEntity<Void> altaSaludo(@RequestBody Saludo saludo){
		servicio.altaSaludo(saludo);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@GetMapping("/{nombre}")
	public ResponseEntity<String> calcularSaludo(
			@PathVariable String nombre, 
			@RequestHeader("language") String idioma){
		String calcularSaludo = servicio.calcularSaludo(nombre, idioma);
		return new ResponseEntity<String>(calcularSaludo,HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<List<String>> consultarTodosLosSaludosGenerados() throws RestClientException, URISyntaxException{
		List<String> saludosGenerados = servicio.consultarTodosLosSaludosGenerados();
		return new ResponseEntity<List<String>>(saludosGenerados,HttpStatus.OK);
	}

}
