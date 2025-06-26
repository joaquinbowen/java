package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {
	//atributos
	private int dia;
	private int hora;
	private int minuto;
	
	//builder
	public Alarma( int dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}

	//toString sobreesrrito
	@Override
	public String toString() {
		return  Util.formatearDia(dia) + ", " + Util.formatearHora(hora) + ":" + minuto + "]";
	}


	//get and set
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	
	
	
}
