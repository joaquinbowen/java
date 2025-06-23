package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	// atributos
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	// contructores
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<Telefono>();
	}

	// metodos
	public void imprimir() {
		if (direccion != null) {

			System.out.println("***" + this.nombre + " " + this.apellido + "****");
			System.out.println("Direccion: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("***" + this.nombre + " " + this.apellido + "****");
			System.out.println("No tiene asociada una direccion");
		}

	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		System.out.println("Telefonos con estado 'C' ");
		Telefono elementoTelefono = null;
		for (int i = 0; i < telefonos.size(); i++) {
			elementoTelefono = telefonos.get(i);
			if ("C".equals(elementoTelefono.getEstado())) {
				System.out.println("Numero: " + elementoTelefono.getNumero() + ", Tipo: " + elementoTelefono.getTipo());
			}
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> listaIncorrectos = new ArrayList<Telefono>();
		Telefono elementoTelefono=null;
		for (int i =0;i<telefonos.size();i++) {
			elementoTelefono=telefonos.get(i);
			if("E".equals(elementoTelefono.getEstado())) {
				listaIncorrectos.add(elementoTelefono);
			}
		}
		return listaIncorrectos;
	}

	// get and set
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

}
