package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion val = new Validacion();
		boolean v1=val.validarMonto(10);
		boolean v2=val.validarMonto(0);
		System.out.println(v1);
		System.out.println(v2);
	}

}
