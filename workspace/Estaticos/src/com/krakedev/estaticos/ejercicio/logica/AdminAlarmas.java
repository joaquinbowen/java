package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	// atributos
	private ArrayList<Alarma> alarmas;
	
	public void agregarAlarma(Alarma alarma) {
		this.alarmas.add(alarma);
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	
	public AdminAlarmas() {
		 alarmas=new ArrayList<Alarma>();
	}
}
