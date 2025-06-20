package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Mario","Benedetti",50));
		admin.agregar(new Persona("Clark","Kent",30));
		admin.agregar(new Persona("Bruce","Wayne",25));
		
		admin.imprimir();
		
		Persona p1=admin.buscarPorNombre("Brucke");
		if(p1!=null) {
			System.out.println("Encontrado: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("Persona no encontrada con ese nombre");
		}
		
		ArrayList<Persona> personasMayores =admin.buscarMayores(10);
		
		System.out.println(personasMayores.size());
		
	}
	

}
