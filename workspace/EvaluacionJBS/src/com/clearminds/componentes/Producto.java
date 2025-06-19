package com.clearminds.componentes;

public class Producto {
	//atributos
	private String nombre;
	private double precio;
	private String codigo;
	
	//metodos
	public void incrementarPrecio(int porcentajeIncremento) {
		double por=(porcentajeIncremento/100.0)*this.precio;
		this.precio+=por;
	}
	
	public void disminuirPrecio(double descuento) {
		this.precio-=descuento;
	}

	//constructores
	public Producto(String nombre, String codigo, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}

	//get and set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
	
}
