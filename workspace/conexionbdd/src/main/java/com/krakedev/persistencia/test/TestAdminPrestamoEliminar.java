package com.krakedev.persistencia.test;

import com.krakedev.persisencia.servicios.AdminPrestamos;

public class TestAdminPrestamoEliminar {
	public static void main(String[] args) {
		String cedula="1710028225";
		
		try {
			AdminPrestamos.eliminar(cedula);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
