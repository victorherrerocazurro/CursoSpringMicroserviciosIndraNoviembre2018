package com.curso.spring.data.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.spring.data.mongo.entities.Persona;
import com.curso.spring.data.mongo.persistence.PersonaMongoRepository;

@SpringBootApplication
public class Application implements ApplicationRunner{

	@Autowired
	private PersonaMongoRepository repository; 
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		//Insercion de registro
		repository.save(new Persona("1", "Victor"));
		repository.save(new Persona("2", "Juan"));
		repository.save(new Persona("3", "Pedro"));
		repository.save(new Persona("4", "Maria"));
		
		//Busqueda con anotacion @Query
		List<Persona> buscarPorNombre = repository.buscarPorNombre("Victor");
		//List<Persona> buscarPorNombre = repository.findByNombre("Victor");
		
		for (Persona persona : buscarPorNombre) {
			System.out.println(persona.toString());
			
			//Actualizacion de registro
			persona.setNombre("Juan");
			
			repository.save(persona);
		}
		
		//Busqueda con nombre de metodo
		buscarPorNombre = repository.findByNombre("Juan");
		
		for (Persona persona : buscarPorNombre) {
			System.out.println(persona.toString());
		}
		
		repository.deleteAll();		
	}
}
