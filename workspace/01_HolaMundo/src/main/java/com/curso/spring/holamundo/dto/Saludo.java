package com.curso.spring.holamundo.dto;

public class Saludo {

	private String prefijo;
	private String sufijo;
	
	@Override
	public String toString() {
		return "Saludo [prefijo=" + prefijo + ", sufijo=" + sufijo + "]";
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
	public Saludo(String prefijo, String sufijo) {
		super();
		this.prefijo = prefijo;
		this.sufijo = sufijo;
	}
	public Saludo() {
		super();
	}
}
