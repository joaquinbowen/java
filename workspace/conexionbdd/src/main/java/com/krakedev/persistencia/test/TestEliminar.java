package com.krakedev.persistencia.test;

import com.krakedev.persisencia.servicios.AdminPersonas;

public class TestEliminar {
	public static void main(String[] args) {
		String cedulaEliminar="1725040478";
		
		try {
			AdminPersonas.eliminar(cedulaEliminar);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
