package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		AdminTelefono at = new AdminTelefono();
		AdminContactos ad = new AdminContactos();
		Telefono t1=new Telefono("movi","0996352410",5);
		
		
		
		
		Contacto c1 = new Contacto("Luis","Perez",t1,0.85);
		
		System.out.println("Nombre: "+c1.getNombre());
		System.out.println("Apellido: "+c1.getApellido());
		System.out.println("Actividad: "+c1.isActivo());
		System.out.println("Peso: "+c1.getPeso());
		System.out.println("Numero: "+c1.getTelefono().getNumero());
		System.out.println("Operadora: "+c1.getTelefono().getOperadora());
		System.out.println("Codigo: "+c1.getTelefono().getCodigo());
		System.out.println("Tiene Whastapp: "+c1.getTelefono().isTieneWhatsapp());
		
		
		at.activarMensajeria(t1);
		ad.activarUsuario(c1);
		
		System.out.println("Nombre: "+c1.getNombre());
		System.out.println("Apellido: "+c1.getApellido());
		System.out.println("Actividad: "+c1.isActivo());
		System.out.println("Peso: "+c1.getPeso());
		System.out.println("Numero: "+c1.getTelefono().getNumero());
		System.out.println("Operadora: "+c1.getTelefono().getOperadora());
		System.out.println("Codigo: "+c1.getTelefono().getCodigo());
		System.out.println("Tiene Whastapp: "+c1.getTelefono().isTieneWhatsapp());
		
		
	}

}
