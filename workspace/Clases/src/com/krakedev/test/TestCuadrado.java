package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado(7);
		Cuadrado c2 = new Cuadrado(14);
		Cuadrado c3 = new Cuadrado(21);

		int areaC1;
		int areaC2;
		int areaC3;
		int periC1;
		int periC2;
		int periC3;

		/*
		c1.setLado(14);
		c2.setLado(7);
		c3.setLado(21);
		*/
		
		areaC1 = c1.calcularArea();
		areaC2 = c2.calcularArea();
		areaC3 = c3.calcularArea();
		periC1 = c1.calcularPerimetro();
		periC2 = c2.calcularPerimetro();
		periC3 = c3.calcularPerimetro();

		System.out.println("Cuadrado 1 Area: " + areaC1);
		System.out.println("Cuadrado 2 Area: " + areaC2);
		System.out.println("Cuadrado 3 Area: " + areaC3);
		System.out.println("Cuadrado 1 Perimetro: " + periC1);
		System.out.println("Cuadrado 2 Perimetro: " + periC2);
		System.out.println("Cuadrado 3 Perimetro: " + periC3);

	}

}
