package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1= new Producto("Papel",17);
		Producto p2= new Producto("Lapiz",-7);
		
		p1.setPrecio(p1.getPrecio());
		p2.setPrecio(p2.getPrecio());
		
		double d1=p1.calcularPrecioPromo(50);
		double d2=p2.calcularPrecioPromo(30);
		
		System.out.println("El producto "+p1.getNombre()+" tiene un valor con descuento de "+d1);
		System.out.println("El producto "+p2.getNombre()+" tiene un valor con descuento de "+d2);
		
		
		
		
	}

}
