package com.krakedev.excepciones;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		
		System.out.println("Inicio");
		String a="xaxaxaxa";
		try {
			a.substring(3);
			System.out.println("fin");
		}catch(Exception ex){
			System.out.println("Entra al catch");
		}finally {
			System.out.println("Ingresa al finally");
		}
		System.out.println("Fuera del catch");
		
	}
}
