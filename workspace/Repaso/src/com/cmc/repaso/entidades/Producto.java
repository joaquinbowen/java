package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private int precio;
	
	public Producto(String nombre,int precio) {
		this.nombre=nombre;
		this.precio=precio;
		
	}
	
	
	public double calcularPrecioPromo(double porcentajeDescuento) {
		double precioConDescuento = this.precio*((100-porcentajeDescuento)/100);
		return precioConDescuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		if(precio<0) {
			precio=precio*-1;
		}
		this.precio = precio;
	}
	
	
	
	
	
	
	
	
}
