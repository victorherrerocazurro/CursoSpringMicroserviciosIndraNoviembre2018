package com.curso.spring.front.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.spring.front.dto.Saludo;

@Service
public class SaludoServiceRestTemplate implements SaludoService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public void altaSaludo(Saludo saludo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bajaSaludo(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Saludo calculoSaludo() {
		// TODO Auto-generated method stub
		return null;
	}

}
