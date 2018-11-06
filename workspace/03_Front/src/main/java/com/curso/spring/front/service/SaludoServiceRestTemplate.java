package com.curso.spring.front.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.curso.spring.front.dto.Saludo;

@Service
public class SaludoServiceRestTemplate implements SaludoService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public void altaSaludo(Saludo saludo) throws RestClientException, URISyntaxException {
		restTemplate.postForEntity(new URI("http://localhost:8080/saludo"), saludo, Void.class);
		
	}

	@Override
	public void bajaSaludo(String id) {
		HashMap<Object, Object> uriVariables = new HashMap<>();
		uriVariables.put("id", id);
		restTemplate.delete("http://localhost:8080/saludo/{id}", uriVariables);

	}

	@Override
	public Saludo calculoSaludo() throws RestClientException, URISyntaxException {
		ResponseEntity<Saludo> entity = restTemplate.getForEntity(new URI("http://localhost:8080/saludo"), Saludo.class);
		return entity.getBody();
	}

}
