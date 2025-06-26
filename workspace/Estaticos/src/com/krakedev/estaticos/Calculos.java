package com.krakedev.estaticos;

public class Calculos {
	//final hace contantes para que no se pueda cambiar
	private final double IVA=12;
	
	public double calcularIva(double monto) {
		
		return monto*IVA/100;
	}
	
	
	
}
