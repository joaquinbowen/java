package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private double nota;
	private String resultado;
	
	
	//construc
	public Estudiante(String nombre) {
		this.nombre=nombre;
	}
	//metodos
	public void calificar(int nota) {
		this.nota=nota;
		if(nota<8) {
			this.resultado="F";
		}else if(nota>=8) {
			this.resultado="A";
		}
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
	
	
	
	
	
}
