package com.curso.spring.back.controllers;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.back.dto.Saludo;
import com.curso.spring.back.service.SaludoService;

@RestController
@RequestMapping("/saludo")
public class SaludoRestController {
	
	@Autowired
	private SaludoService saludoService;
	
	@PostMapping
	public ResponseEntity<Void> altaSaludo(@RequestBody Saludo saludo) throws URISyntaxException {
		saludoService.altaSaludo(saludo);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(new URI("http://localhost:8080/saludo/1"));
		return new ResponseEntity<>(headers, HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> bajaSaludo(@PathVariable String id) {
		saludoService.bajaSaludo(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity<Saludo> calculoSaludo() {
		Saludo saludo = saludoService.calculoSaludo();
		return new ResponseEntity<Saludo>(saludo,HttpStatus.OK);
	}
}
