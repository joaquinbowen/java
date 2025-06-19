package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda = new Celda("A1");
		System.out.println(celda.getProducto().getNombre()); // el error está en la clase celda ya que se deja el
																// atributo producto como null,linea 8,la variable
																// celda ocasiona el error.

		System.out.println("CELDA:" + celda.getProducto());
		System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
		System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:" + celda.getProducto().getCodigo());
		System.out.println("STOCK:" + celda.getStock());
		System.out.println("*************************************");
	}
}
