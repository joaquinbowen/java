package com.krakedev.evaluacion.entidades;

import java.util.Date;

public class HistorialMovimiento {
	private int id;
	private Producto producto;
	private int cantidad;
	private Date fechaMovimiento;

	@Override
	public String toString() {
		return "HistorialMovimiento [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad
				+ ", fechaMovimiento=" + fechaMovimiento + "]";
	}

	public HistorialMovimiento(int id, Producto producto, int cantidad, Date fechaMovimiento) {
		super();
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
		this.fechaMovimiento = fechaMovimiento;
	}

	public HistorialMovimiento() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}

	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	
	

}
