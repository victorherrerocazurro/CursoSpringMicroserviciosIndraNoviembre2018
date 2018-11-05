package com.curso.spring.holamundo.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.holamundo.dto.Saludo;

@RestController
@RequestMapping("/saludos")
public class SaludosRestController {


	//Solo las request por GET, que tengan la cabecera accept=application/json
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public Saludo consulta() {
		return new Saludo("Hola", "!!!!");
	}
	
	@GetMapping(path="/{id}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Saludo consultaPorIdentificador(@PathVariable String id) {
		return new Saludo("Hola", "!!!!");
	}
	
	//Solo las request por POST, que tengan la cabecera content_type=application/json
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public void alta(@RequestBody Saludo saludo) {
		System.out.println("Dando de alta el saludo: "+ saludo);
	}
	
}
