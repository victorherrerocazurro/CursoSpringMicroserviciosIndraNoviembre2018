package com.curso.spring.ejercicio.nosql.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curso.spring.ejercicio.nosql.entities.ComposicionSaludo;

public interface SaludoMongoRepository extends MongoRepository<ComposicionSaludo, String> {

}
