package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi","0995532274",36);
		Contacto c = new Contacto("Juan","Perez",telef,0.25);
		System.out.println("Nombre: "+c.getNombre());
		System.out.println("Apellido: "+c.getApellido());
		System.out.println("Peso: "+c.getPeso());
		System.out.println("Numero: "+telef.getNumero());
		System.out.println("Operadora: "+telef.getOperadora());

	}

}
