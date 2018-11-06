package com.curso.spring.data.jpa.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.spring.data.jpa.entities.Persona;

public interface PersonaJpaRepository extends JpaRepository<Persona, String>{

	List<Persona> findByNombre(String nombre);
	
	@Query("select p from Persona p where p.nombre = :nombre")
	List<Persona> buscarPorNombre(@Param("nombre") String nombre);
	
}
