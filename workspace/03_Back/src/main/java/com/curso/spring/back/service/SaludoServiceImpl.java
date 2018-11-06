package com.curso.spring.back.service;

import org.springframework.stereotype.Service;

import com.curso.spring.back.dto.Saludo;

@Service
public class SaludoServiceImpl implements SaludoService {

	public void altaSaludo(Saludo saludo) {
		System.out.println("[Back] AltaSaludo");
	}

	public void bajaSaludo(String id) {
		System.out.println("[Back] BajaSaludo");

	}

	public Saludo calculoSaludo() {
		System.out.println("[Back] CalculoSaludo");
		return null;
	}

}
