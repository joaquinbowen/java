package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	// atributos
	private double saldo;
	private ArrayList<Celda> celdas;

	// metodos
	public void agregarCelda(String codigoCelda) {
		Celda nuevaCelda = new Celda(codigoCelda);
		celdas.add(nuevaCelda);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda" + (i + 1) + ": " + elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigoCelda) {
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigoCelda.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto producto, String codigoCelda, int itemsAColocar) {
		Celda celdaEncontrada = this.buscarCelda(codigoCelda);
		if (celdaEncontrada != null) {
			celdaEncontrada.ingresarProducto(producto, itemsAColocar);
		}
	}

	public void mostrarProductos() {
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if(elementoCelda!=null && elementoCelda.getProducto()!=null) {
				System.out.println("Celda: " + elementoCelda.getCodigo() + " Stock: " + elementoCelda.getStock()
				+ " Producto:" + elementoCelda.getProducto().getNombre() + " Precio: "
				+ elementoCelda.getProducto().getPrecio());
			}else {
				System.out.println("Celda: "+elementoCelda.getCodigo()+" Stock:0  Sin producto asignado :(");
			}
			
		}
		System.out.println("Saldo: "+this.saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda) {
		Celda elementoCelda=null;
		Producto productoEncontrado=null;
		for (int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if (codigoCelda.equals(elementoCelda.getCodigo())) {
				productoEncontrado=elementoCelda.getProducto();
			}
		}
		return productoEncontrado;
		
	}
	
	public double consultarPrecio(String codigoCelda) {
		Producto productoEncontrado=this.buscarProductoEnCelda(codigoCelda);
		double precioEncontrado=0.00;
		if(productoEncontrado!=null) {
			precioEncontrado=productoEncontrado.getPrecio();
		}
		return precioEncontrado;
	}
	
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda celdaEncontrada=null;
		Celda elementoCelda=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto()!=null) {
				if(codigoProducto.equals(elementoCelda.getProducto().getCodigo())) {
					celdaEncontrada=elementoCelda;
				}
			}
			
		}
		return celdaEncontrada;
	}
	
	public void incrementarProductos(String codigoProducto,int itemsAIncrementar) {
		Celda celdaEncontrada=this.buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada!=null) {
			int stockEncontrado=celdaEncontrada.getStock();
			celdaEncontrada.setStock(stockEncontrado+=itemsAIncrementar);
		}
	}
	
	public void vender(String codigoCelda) {
		Celda celdaEncontrada=this.buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		double precioProducto=celdaEncontrada.getProducto().getPrecio();
		this.saldo+=precioProducto;
		this.mostrarProductos();
	}
	
	public double venderConCambio(String codigoCelda,int valorIngresado) {
		Celda celdaEncontrada=this.buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		double precioProducto=celdaEncontrada.getProducto().getPrecio();
		this.saldo+=precioProducto;
		double cambio=valorIngresado-precioProducto;
		this.mostrarProductos();
		return cambio;
		
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> lista=new ArrayList<Producto>();
		Celda elementoCelda=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto().getPrecio()<limite) {
				lista.add(elementoCelda.getProducto());
			}
		}
		return lista;
	}

	// contructores
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}
	// get and set

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

}
