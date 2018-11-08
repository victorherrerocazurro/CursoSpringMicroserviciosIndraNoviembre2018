package com.curso.spring.ejercicio.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.spring.ejercicio.dto.Saludo;

public interface SaludoJpaRepository extends JpaRepository<Saludo, String> {

	Saludo findByIdioma(String idioma);
	
}
