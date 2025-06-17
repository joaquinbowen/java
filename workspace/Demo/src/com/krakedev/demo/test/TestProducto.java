package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto(9,"Hola");
		p1.setDescripcion("Hola mundo");
		p1.setPeso(3.5);
		
		System.out.println("Producto");
		System.out.println("Codigo: "+p1.getCodigo());
		System.out.println("Nombre: "+p1.getNombre());
		System.out.println("Descripcion: "+p1.getDescripcion());
		System.out.println("Peso: "+p1.getPeso()+"Kg");

	}

}
