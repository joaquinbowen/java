package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;

public class TestAlarmas {
	public static void main(String[] args) {

		AdminAlarmas admin=new AdminAlarmas();
		admin.agregarAlarma(new Alarma(DiasSemana.LUNES, 5, 10));
		admin.agregarAlarma(new Alarma(DiasSemana.MARTES,6,40));
		admin.agregarAlarma(new Alarma(DiasSemana.MIERCOLES,7,30));
		admin.agregarAlarma(new Alarma(DiasSemana.JUEVES,8,25));
		admin.agregarAlarma(new Alarma(DiasSemana.VIERNES,4,50));
		admin.agregarAlarma(new Alarma(DiasSemana.SABADO,3,35));
		admin.agregarAlarma(new Alarma(DiasSemana.DOMINGO,10,15));
		
		ArrayList<Alarma> alarmasActuales=admin.getAlarmas();
		System.out.println(alarmasActuales);
		
	}
}
