package com.curso.spring.ejercicio.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curso.spring.ejercicio.entities.ComposicionSaludo;

public interface SaludoMongoRepository extends MongoRepository<ComposicionSaludo, String> {

}
