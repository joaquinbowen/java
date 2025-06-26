package com.krakedev.herencia;

public class Gato extends Animal{
	
	@Override
	public void dormir() {
		System.out.println("ay mi gatito miau miau");
	}
	
	public void maullar() {
		System.out.println("Miau miau");
	}
	
	public void maullar(String adjetivo) {
		System.out.println("Miau miau "+adjetivo);
	}

}
