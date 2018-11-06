package com.curso.spring.data.mongo.persistence;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.spring.data.mongo.entities.Persona;

public interface PersonaMongoRepository extends MongoRepository<Persona, String>{

	List<Persona> findByNombre(String nombre);
	
	//TODO Revisar si es compatible con consultas tipo JPQL
	//@Query("select p from Persona p where p.nombre = :nombre")
	@Query("{'nombre' : ?0 }")
	List<Persona> buscarPorNombre(String nombre);
	
}
