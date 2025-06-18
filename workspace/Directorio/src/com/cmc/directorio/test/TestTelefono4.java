package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		AdminTelefono at = new AdminTelefono();
		Telefono t1 = new Telefono("claro","0995531122",7);
		Telefono t2 = new Telefono("movi","0995531122",7);
		Telefono t3 = new Telefono("claro","0995531122",7);
		Telefono t4 = new Telefono("claro","0995531122",7);
		
		int contadorClaro=at.contarClaro(t1, t2, t3, t4);
		System.out.println(contadorClaro+" telefonos son claro.");
	}

}
