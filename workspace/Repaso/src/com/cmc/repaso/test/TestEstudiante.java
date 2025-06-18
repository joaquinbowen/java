package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1= new Estudiante("Pepe");
		est1.calificar(8);
		System.out.println("Su resultado es: "+est1.getResultado());

	}

}
