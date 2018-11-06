package com.curso.spring.back.dto;

public class Saludo {

	private String prefijo;
	private String sufijo;
	public Saludo(String prefijo, String sufijo) {
		super();
		this.prefijo = prefijo;
		this.sufijo = sufijo;
	}
	public Saludo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPrefijo() {
		return prefijo;
	}
	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}
	public String getSufijo() {
		return sufijo;
	}
	public void setSufijo(String sufijo) {
		this.sufijo = sufijo;
	}
}
