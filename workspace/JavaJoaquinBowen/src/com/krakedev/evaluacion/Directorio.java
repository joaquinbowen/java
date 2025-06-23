package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	// atributos
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	// contructores
	public Directorio() {
		this.contactos = new ArrayList<Contacto>();
		fechaModificacion = new Date();
		this.correctos= new ArrayList<Contacto>();
		this.incorrectos= new ArrayList<Contacto>();
	}

	// metodos
	public boolean agregarContacto(Contacto contacto) {
		boolean contactoAñadido = false;
		Contacto contactoEncontrado = this.buscarPorCedula(contacto.getCedula());
		if (contactoEncontrado == null) {
			contactos.add(contacto);
			contactoAñadido = true;
			fechaModificacion = new Date();

		}
		return contactoAñadido;
	}

	public String consultarUltimaModificacion() {
		if (fechaModificacion == null) {
			return "No hay modificaciones registradas";
		}

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(fechaModificacion);
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto elementoContacto = null;
		Contacto contactoEncontrado = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (cedula.equals(elementoContacto.getCedula())) {
				contactoEncontrado = elementoContacto;
			}
		}
		return contactoEncontrado;
	}

	public int contarPerdidos() {
		int contactosPerdidos = 0;
		Contacto elementoContacto = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				contactosPerdidos++;
			}
		}
		return contactosPerdidos;
	}

	public int contarFijos() {
		int telefonosFijos = 0;
		Contacto elementoContacto = null;
		Telefono elementoTelefono = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			for (int j = 0; j < elementoContacto.getTelefonos().size(); j++) {
				elementoTelefono = elementoContacto.getTelefonos().get(j);
				if ("C".equals(elementoTelefono.getEstado()) && "Convencional".equals(elementoTelefono.getTipo())) {
					telefonosFijos++;
				}
			}
		}

		return telefonosFijos;
	}
	
	public void depurar() {
		Contacto elementoContacto=null;
		for(int i =0;i<contactos.size();i++) {
			elementoContacto=contactos.get(i);
			if(elementoContacto.getDireccion()==null) {
				Contacto incorrecto=contactos.get(i);
				incorrectos.add(incorrecto);
			}else {
				Contacto correcto=contactos.get(i);
				correctos.add(correcto);
			}
		}
		contactos.clear();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

}
