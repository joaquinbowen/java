package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi","098234234",20);
		AdminTelefono at = new AdminTelefono();
		
		at.activarMensajeria(telf);
		
		telf.imprimir();
			
		
			
	}

}
