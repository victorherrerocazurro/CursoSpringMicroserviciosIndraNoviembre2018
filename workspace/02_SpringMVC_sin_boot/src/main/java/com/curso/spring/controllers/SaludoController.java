package com.curso.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.spring.dto.Saludo;
import com.curso.spring.service.SaludoService;

@Controller
@RequestMapping("/saludo")
public class SaludoController {
	
	@Autowired
	private SaludoService service;//referencia a un objeto
	
	@PostMapping
	public String altaSaludo(Saludo saludo) {
		return null;
	}
	
	@DeleteMapping
	public String bajaSaludo(String id) {
		return null;
	}
	
	@GetMapping
	public String calculoSaludo() {
		return null;
	}
}
