package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto("Toyota",1986,20000.5);
		Auto auto2 = new Auto("Mazda",1995,24000.7);
		
		/*
		auto1.setMarca("Toyota");
		auto1.setAnio(1986);
		auto1.setPrecio(20000.50);
		
		auto2.setMarca("Mazda");
		auto2.setAnio(1995);
		auto2.setPrecio(24000.7);
		*/
		
		System.out.println("Auto 1");
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Anio: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		
		System.out.println("-------------------");
		System.out.println("Auto 2");
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Anio: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());

	}

}
