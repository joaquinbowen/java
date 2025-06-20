package com.clearminds.componentes;

public class Producto {
	//atributos
	private String nombre;
	private double precio;
	private String codigo;
	//contructores
	public Producto(String codigo,String nombre,  double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	//metodos
	public void incrementarPrecio(int porcentajeIncremento) {
		double por=(porcentajeIncremento/100.0)*this.precio;
		this.precio+=por;
	}
	
	public void disminuirPrecio(double valorDescuento) {
		this.precio-=valorDescuento;
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
