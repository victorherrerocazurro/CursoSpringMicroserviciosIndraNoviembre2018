package com.curso.spring.holamundo.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/holamundo")
public class HolaMundoControlador {

	//[GET] http://....../holamundo?name=Victor
	@GetMapping
	public String holaMundo(
			@RequestParam(name="name") String nombre, 
			Map<String, String> model) {
		model.put("name", nombre);
		return "holamundo";
	}
	
	@PostMapping
	public void nuevoSaludo() {
		
	}
	
}
