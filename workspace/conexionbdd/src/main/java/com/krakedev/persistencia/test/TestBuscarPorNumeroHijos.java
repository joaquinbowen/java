package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persisencia.servicios.AdminPersonas;
import com.krakedev.persistencia.entidades.Persona;

public class TestBuscarPorNumeroHijos {
	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas=AdminPersonas.buscarPorNumeroHijos(2);
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
