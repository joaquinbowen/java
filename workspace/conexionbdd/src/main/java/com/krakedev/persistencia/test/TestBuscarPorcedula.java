package com.krakedev.persistencia.test;

import com.krakedev.persisencia.servicios.AdminPersonas;
import com.krakedev.persistencia.entidades.Persona;

public class TestBuscarPorcedula {
	public static void main(String[] args) {
		try {
			Persona p=AdminPersonas.buscarPorCedula("1710028225");
			System.out.println(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

