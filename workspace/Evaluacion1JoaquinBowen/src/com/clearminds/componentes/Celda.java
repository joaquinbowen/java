package com.clearminds.componentes;

public class Celda {
	//atributos
	private Producto producto;
	private int stock;
	private String codigo;
	//contructores
	public Celda(String codigoCelda) {
		this.codigo=codigoCelda;
	}
	//metodos
	public void ingresarProducto(Producto producto,int stockInicial) {
		this.producto=producto;
		this.stock=stockInicial;
	}
	//get and set
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
