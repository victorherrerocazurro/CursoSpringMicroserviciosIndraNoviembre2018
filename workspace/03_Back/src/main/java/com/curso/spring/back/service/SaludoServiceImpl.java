package com.curso.spring.back.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.back.dto.Saludo;

@RestController
@RequestMapping("/saludo")
public class SaludoServiceImpl implements SaludoService {

	@PostMapping
	public void altaSaludo(@RequestBody Saludo saludo) {
		// TODO Auto-generated method stub

	}

	@DeleteMapping("/{id}")
	public void bajaSaludo(@PathVariable String id) {
		// TODO Auto-generated method stub

	}

	@GetMapping
	public Saludo calculoSaludo() {
		// TODO Auto-generated method stub
		return null;
	}

}
