package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persisencia.servicios.AdminPersonas;
import com.krakedev.persistencia.entidades.Persona;

public class TestConsultaPersonas {
	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas=AdminPersonas.buscarPorNombre("Manolito");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
