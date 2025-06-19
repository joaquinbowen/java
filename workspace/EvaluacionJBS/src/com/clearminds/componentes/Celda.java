package com.clearminds.componentes;

public class Celda {
	//atributos
	private Producto producto;
	private int stock;
	private String codigo;
	
	//metodos
	public void ingresarProducto(Producto p1,int stockInicial) {
		this.producto=p1;
		this.stock=stockInicial;
	}
	//contructores
	public Celda() {
		
	}
	public Celda(String codigo) {
		this.codigo=codigo;
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
