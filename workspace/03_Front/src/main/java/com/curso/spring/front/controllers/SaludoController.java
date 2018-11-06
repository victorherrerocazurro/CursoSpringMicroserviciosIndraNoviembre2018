package com.curso.spring.front.controllers;

import java.net.URISyntaxException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;

import com.curso.spring.front.dto.Saludo;
import com.curso.spring.front.service.SaludoService;

@Controller
@RequestMapping("/saludo")
public class SaludoController {
	
	@Autowired
	private SaludoService service;//referencia a un objeto
	
	@PostMapping
	public String altaSaludo(Saludo saludo) throws RestClientException, URISyntaxException {
		service.altaSaludo(saludo);
		return null;
	}
	
	@DeleteMapping
	public String bajaSaludo(String id) {
		return null;
	}
	
	@GetMapping
	public String calculoSaludo(Map<String, Object> model) throws RestClientException, URISyntaxException {
		Saludo calculoSaludo = service.calculoSaludo();
		model.put("saludo", calculoSaludo);
		return "detalleSaludo";
	}
}
