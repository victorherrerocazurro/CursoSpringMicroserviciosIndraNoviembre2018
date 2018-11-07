package com.curso.spring.ejercicio.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.spring.ejercicio.dto.Saludo;
import com.curso.spring.ejercicio.entities.ComposicionSaludo;
import com.curso.spring.ejercicio.persistence.SaludoJpaRepository;
import com.curso.spring.ejercicio.persistence.SaludoMongoRepository;

@Service
public class ServicioSaludoImpl implements ServicioSaludo {

	@Autowired
	private SaludoJpaRepository repositorioSaludoJpa;
	@Autowired
	private SaludoMongoRepository repositorioSaludoMongo;

	@Override
	public void altaSaludo(Saludo saludo) {

		repositorioSaludoJpa.save(saludo);

	}

	@Override
	public String calcularSaludo(String nombre, String idioma) {
		
		Optional<Saludo> saludo = repositorioSaludoJpa.findById(idioma);
		
		String resultado = saludo.get().getPrefijo() + nombre + saludo.get().getSufijo();
		
		repositorioSaludoMongo.save(new ComposicionSaludo(resultado, resultado));
		
		return resultado;
	}

	@Override
	public List<String> consultarTodosLosSaludosGenerados() {

		List<ComposicionSaludo> saludos = repositorioSaludoMongo.findAll();
		
		/*List<String> resultado = new ArrayList<>();
		
		for (ComposicionSaludo saludo : saludos) {
			resultado.add(saludo.getSaludo());
		}*/
		
		Stream<String> map = saludos.stream().map(
				(dato) ->  {return dato.getSaludo();});
		
		return map.collect(Collectors.toList());
	}

}
