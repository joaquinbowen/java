package com.cmc.directorio.entidades;

public class Contacto {
	//atributos
	private String nombre;
	private String apellido;
	private boolean activo;
	private Telefono telefono;
	private double peso;
	//contructores
	public Contacto(String nombre, String apellido, Telefono telefono, double peso) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}
	//set and get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
