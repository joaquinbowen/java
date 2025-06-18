package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		AdminContactos ad = new AdminContactos();
		Telefono t1=new Telefono("movi","0996352410",5);
		Telefono t2=new Telefono("movi","0996352410",5);
		Contacto c1 = new Contacto("Juan","Perez",t1,0.25);
		Contacto c2 = new Contacto("Mar","Paz",t2,0.75);
		
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
