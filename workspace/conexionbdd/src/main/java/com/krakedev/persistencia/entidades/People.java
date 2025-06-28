package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class People {
	private String cedula;
	private String nombre;
	private String apellido;
	private double estatura;
	private Date fechaNacimiento;
	private Date horaNacimiento;
	private BigDecimal cantidadAhorrada;
	private int numeroHijos;
	private Prestamo prestamo;

	@Override
	public String toString() {
		return "People [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estatura=" + estatura
				+ ", fechaNacimiento=" + fechaNacimiento + ", horaNacimiento=" + horaNacimiento + ", cantidadAhorrada="
				+ cantidadAhorrada + ", numeroHijos=" + numeroHijos + ", prestamo=" + prestamo + "]";
	}

	
	
	
	public People(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}




	public People() {
	}

	public People(String cedula, String nombre, String apellido, double estatura, Date fechaNacimiento,
			Date horaNacimiento, BigDecimal cantidadAhorrada, int numeroHijos, Prestamo prestamo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
		this.fechaNacimiento = fechaNacimiento;
		this.horaNacimiento = horaNacimiento;
		this.cantidadAhorrada = cantidadAhorrada;
		this.numeroHijos = numeroHijos;
		this.prestamo = prestamo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

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

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getHoraNacimiento() {
		return horaNacimiento;
	}

	public void setHoraNacimiento(Date horaNacimiento) {
		this.horaNacimiento = horaNacimiento;
	}

	public BigDecimal getCantidadAhorrada() {
		return cantidadAhorrada;
	}

	public void setCantidadAhorrada(BigDecimal cantidadAhorrada) {
		this.cantidadAhorrada = cantidadAhorrada;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

}
