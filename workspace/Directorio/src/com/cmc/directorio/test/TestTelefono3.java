package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		AdminTelefono at = new AdminTelefono();
		Telefono t1 = new Telefono("claro","0995531122",7);
		Telefono t2 = new Telefono("movi","0995531122",7);
		Telefono t3 = new Telefono("movi","0995531122",7);
		
		int contadorMovi=at.contarMovi(t1, t2, t3);
		System.out.println(contadorMovi+" telefonos tiene movi.");

	}

}
