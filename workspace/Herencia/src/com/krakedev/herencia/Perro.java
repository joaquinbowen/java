package com.krakedev.herencia;

public class Perro extends Animal{
	
	
	
	public Perro() {
		System.out.println("Ejecuta contructor Perro");
	}
	
	public void ladrar() {
		System.out.println("Perro ladrando");
	}
	
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Perro durmuendo");
	}
}
