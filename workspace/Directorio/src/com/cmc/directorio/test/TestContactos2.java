package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		AdminTelefono at = new AdminTelefono();
		AdminContactos ad = new AdminContactos();
		Telefono t1=new Telefono("movi","0996352410",5);
		Telefono t2=new Telefono("claro","0996352410",5);
		
		at.activarMensajeria(t1);
		
		
		Contacto c1 = new Contacto("Luis","Perez",t1,0.85);
		Contacto c2 = new Contacto("Luz","Paz",t2,0.75);
		
		ad.activarUsuario(c1);
		
		
		Contacto pesao=ad.buscarMasPesado(c1, c2);
		System.out.println("Nombre: "+pesao.getNombre());
		System.out.println("Apellido: "+pesao.getApellido());
		System.out.println("Actividad: "+pesao.isActivo());
		System.out.println("Peso: "+pesao.getPeso());
		System.out.println("Numero: "+pesao.getTelefono().getNumero());
		System.out.println("Operadora: "+pesao.getTelefono().getOperadora());
		System.out.println("Codigo: "+pesao.getTelefono().getCodigo());
		System.out.println("Tiene Whastapp: "+pesao.getTelefono().isTieneWhatsapp());
		
		System.out.println("Son la misma operadora: "+ad.compararOperadoras(c1, c2));

	}

}
