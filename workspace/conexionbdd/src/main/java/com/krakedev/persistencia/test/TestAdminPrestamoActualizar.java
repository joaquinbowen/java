package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persisencia.servicios.AdminPrestamos;
import com.krakedev.persistencia.entidades.People;
import com.krakedev.persistencia.entidades.Prestamo;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPrestamoActualizar {
	public static void main(String[] args) {
		People per =new People("1710021224","Bling","Bling");
		Prestamo prest=new Prestamo("1710021224");
		prest.setMonto(new BigDecimal(1205.12));
		prest.setGarante("BLing bling");
		per.setCantidadAhorrada(new BigDecimal(98887321.45));
		per.setNumeroHijos(2);
		per.setEstatura(1.91);
		try {
			per.setFechaNacimiento(Convertidor.convertirFecha("1989/01/01"));
			per.setHoraNacimiento(Convertidor.convertirHora("05:34"));
			prest.setFechaPrestamo(Convertidor.convertirFecha("2020/07/14"));
			prest.setHoraPrestamo(Convertidor.convertirHora("11:33"));
		} catch (Exception e) {
			System.out.println("ereoor"+ e.getMessage());
		}
		per.setPrestamo(prest);
		
		try {
			AdminPrestamos.actualizar(per);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
