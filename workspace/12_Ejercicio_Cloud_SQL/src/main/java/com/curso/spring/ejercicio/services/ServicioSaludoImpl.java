package com.curso.spring.ejercicio.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.curso.spring.ejercicio.dto.Saludo;
import com.curso.spring.ejercicio.persistence.SaludoJpaRepository;


@Service
public class ServicioSaludoImpl implements ServicioSaludo {

	@Autowired
	private SaludoJpaRepository repositorioSaludoJpa;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void altaSaludo(Saludo saludo) {
		repositorioSaludoJpa.save(saludo);
	}

	@Override
	public String calcularSaludo(String nombre, String idioma) {
		
		Optional<Saludo> saludo = repositorioSaludoJpa.findById(idioma);
		
		String resultado = saludo.get().getPrefijo() + nombre + saludo.get().getSufijo();
		
		rabbitTemplate.convertAndSend(
				"spring-boot-exchange", //Identificador del Exchange que recive los mensajes 
				"foo.bar.baz", //Categoria de los mensajes que indica al Exchange a que Queue ha de enviar los mensajes 
				resultado); //Mensaje
		
		return resultado;
	}

	@Override
	public List<String> consultarTodosLosSaludosGenerados() throws RestClientException, URISyntaxException {
		ResponseEntity<List> respuesta = restTemplate
											.getForEntity(
													new URI("http://nosql"), 
													List.class);
		return respuesta.getBody();
	}

}
