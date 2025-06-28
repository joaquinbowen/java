package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;

	private EstadoCivil estadoCivil;
	
	private double estatura;
	private int numeroHijos;
	private BigDecimal cantidadAhorrada;
	private Date fechaNacimiento;
	private Date horaNacimiento;

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil="
				+ estadoCivil + ", numeroHijos=" + numeroHijos + ", cantidadAhorrada=" + cantidadAhorrada
				+ ", fechaNacimiento=" + fechaNacimiento + ", horaNacimiento=" + horaNacimiento + "]";
	}

	public Persona() {
	}



	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil, double estatura,
			int numeroHijos, BigDecimal cantidadAhorrada, Date fechaNacimiento, Date horaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.estatura = estatura;
		this.numeroHijos = numeroHijos;
		this.cantidadAhorrada = cantidadAhorrada;
		this.fechaNacimiento = fechaNacimiento;
		this.horaNacimiento = horaNacimiento;
	}

	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadoCivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
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

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public BigDecimal getCantidadAhorrada() {
		return cantidadAhorrada;
	}

	public void setCantidadAhorrada(BigDecimal cantidadAhorrada) {
		this.cantidadAhorrada = cantidadAhorrada;
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

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

}
