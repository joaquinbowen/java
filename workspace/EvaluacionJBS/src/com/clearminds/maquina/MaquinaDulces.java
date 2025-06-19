package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	// atributos
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public MaquinaDulces() {
		this.celda1 = new Celda();
		this.celda2 = new Celda();
		this.celda3 = new Celda();
		this.celda4 = new Celda();
	}

	// metodos
	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		this.celda1.setCodigo(cod1);
		this.celda2.setCodigo(cod2);
		this.celda3.setCodigo(cod3);
		this.celda4.setCodigo(cod4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: " + celda1.getCodigo());
		System.out.println("Celda 2: " + celda2.getCodigo());
		System.out.println("Celda 3: " + celda3.getCodigo());
		System.out.println("Celda 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String code) {
		if (code == celda1.getCodigo()) {
			return celda1;
		} else if (code == celda2.getCodigo()) {
			return celda2;
		} else if (code == celda3.getCodigo()) {
			return celda3;
		} else if (code == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto p, String codigo, int cantidadInicial) {
		Celda celdaRecuperada = this.buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(p, cantidadInicial);
	}

	public void mostrarProductos() {

		if (this.celda1.getProducto() != null) {
			System.out.println("Celda " + this.celda1.getCodigo());
			System.out.println("Codigo producto: " + this.celda1.getProducto().getCodigo());
			System.out.println("Stock Actual: " + this.celda1.getStock());
			System.out.println("Nombre producto: " + this.celda1.getProducto().getNombre());
			System.out.println("Precio producto: " + this.celda1.getProducto().getPrecio());
		} else {
			System.out.println("Celda " + this.celda1.getCodigo());
			System.out.println("Stock: 0");
			System.out.println("La celda no tiene producto!!!");
		}
		if (this.celda2.getProducto() != null) {
			System.out.println("Celda " + this.celda2.getCodigo());
			System.out.println("Codigo producto: " + this.celda2.getProducto().getCodigo());
			System.out.println("Stock Actual: " + this.celda2.getStock());
			System.out.println("Nombre producto: " + this.celda2.getProducto().getNombre());
			System.out.println("Precio producto: " + this.celda2.getProducto().getPrecio());
		} else {
			System.out.println("Celda " + this.celda2.getCodigo());
			System.out.println("Stock: 0");
			System.out.println("La celda no tiene producto!!!");
		}
		if (this.celda3.getProducto() != null) {
			System.out.println("Celda " + this.celda3.getCodigo());
			System.out.println("Codigo producto: " + this.celda3.getProducto().getCodigo());
			System.out.println("Stock Actual: " + this.celda3.getStock());
			System.out.println("Nombre producto: " + this.celda3.getProducto().getNombre());
			System.out.println("Precio producto: " + this.celda3.getProducto().getPrecio());
		} else {
			System.out.println("Celda " + this.celda3.getCodigo());
			System.out.println("Stock: 0");
			System.out.println("La celda no tiene producto!!!");
		}
		if (this.celda4.getProducto() != null) {
			System.out.println("Celda " + this.celda4.getCodigo());
			System.out.println("Codigo producto: " + this.celda4.getProducto().getCodigo());
			System.out.println("Stock Actual: " + this.celda4.getStock());
			System.out.println("Nombre producto: " + this.celda4.getProducto().getNombre());
			System.out.println("Precio producto: " + this.celda4.getProducto().getPrecio());
		} else {
			System.out.println("Celda " + this.celda4.getCodigo());
			System.out.println("Stock: 0");
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("Saldo de la maquina: " + this.saldo);

	}

	public Producto buscarProductoEnCelda(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return this.celda1.getProducto();
		} else if (codigoCelda == celda2.getCodigo()) {
			return this.celda2.getProducto();
		} else if (codigoCelda == celda3.getCodigo()) {
			return this.celda3.getProducto();
		} else if (codigoCelda == celda4.getCodigo()) {
			return this.celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigoCelda) {
		if (codigoCelda == celda1.getCodigo()) {
			return this.celda1.getProducto().getPrecio();
		} else if (codigoCelda == celda2.getCodigo()) {
			return this.celda2.getProducto().getPrecio();
		} else if (codigoCelda == celda3.getCodigo()) {
			return this.celda3.getProducto().getPrecio();
		} else if (codigoCelda == celda4.getCodigo()) {
			return this.celda4.getProducto().getPrecio();
		} else {
			return 0.00;
		}

	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (celda1.getProducto() != null && codigoProducto == celda1.getProducto().getCodigo()) {
			return celda1;
		}
		if (celda2.getProducto() != null && codigoProducto == celda2.getProducto().getCodigo()) {
			return celda2;
		}
		if (celda3.getProducto() != null && codigoProducto == celda3.getProducto().getCodigo()) {
			return celda3;
		}
		if (celda4.getProducto() != null && codigoProducto == celda4.getProducto().getCodigo()) {
			return celda4;
		}

		return null;
	}

	public void incrementarProductos(String codigoProducto, int itemsAIncrementar) {
		Celda celdaEncontrada = this.buscarCeldaProducto(codigoProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + itemsAIncrementar);
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = this.buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		double precioEncontrado = celdaEncontrada.getProducto().getPrecio();
		this.saldo += precioEncontrado;
	}

	public double venderConCambio(String codigoCelda, double valorIngresado) {
		Celda celdaEncontrada = this.buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		double precioEncontrado = celdaEncontrada.getProducto().getPrecio();
		this.saldo += precioEncontrado;
		return valorIngresado - precioEncontrado;
	}

	// Set and get
	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
