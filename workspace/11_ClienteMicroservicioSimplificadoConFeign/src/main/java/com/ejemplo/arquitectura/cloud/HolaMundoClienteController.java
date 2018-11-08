package com.ejemplo.arquitectura.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoClienteController {

	@Autowired
    private HolaMundoCliente holaMundoCliente;
	
	@RequestMapping("/")
	public String home() {
		return holaMundoCliente.holaMundo() + " con Feign";

	}
}
