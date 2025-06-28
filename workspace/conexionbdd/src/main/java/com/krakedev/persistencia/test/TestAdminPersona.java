package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persisencia.servicios.AdminPersonas;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {
	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("1710028225", "Julio", "Jaramillo", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("1998/12/24");
			Date horaNac = Convertidor.convertirHora("13:59");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setEstatura(1.69);
			p.setCantidadAhorrada(new BigDecimal(1200.78));
			p.setNumeroHijos(50);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema:"+e.getMessage());
		}

	}
}
