package com.krakedev.estaticos.ejercicio.utils;

public class Util {

	public static String formatearHora(int numero) {
		String valor = null;
		if (numero >= 0 && numero < 10) {
			valor = "0" + numero + "";
		} else {
			valor = numero + "";
		}
		return valor;
	}
	
	public static String formatearDia(int numero) {
		if(numero==0) {
			return "Lunes";
		}else if(numero==1) {
			return "Martes";
		}else if(numero==2) {
			return "Miercoles";
		}else if(numero==3) {
			return "Jueves";
		}else if(numero==4) {
			return "Viernes";
		}else if(numero==5) {
			return "Sabado";
		}else if(numero==6) {
			return "Domingo";
		}else {
			return "dia invalido";
		}
		
	}
}
