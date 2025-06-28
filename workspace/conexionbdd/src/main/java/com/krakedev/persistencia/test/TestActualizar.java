package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persisencia.servicios.AdminPersonas;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		EstadoCivil ec=new EstadoCivil("C","Casado");
		Persona p =new Persona("1710028225","Manolito","Ferragamo",ec);
		
		try {
			Date fechaNac=Convertidor.convertirFecha("1920/05/30");
			Date horaNac =Convertidor.convertirHora("11:11");
			p.setFechaNacimiento(fechaNac);
			p.setHoraNacimiento(horaNac);
			p.setCantidadAhorrada(new BigDecimal(89733.21));
			p.setEstatura(1.89);
			p.setNumeroHijos(7);
			AdminPersonas.actualizar(p);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
