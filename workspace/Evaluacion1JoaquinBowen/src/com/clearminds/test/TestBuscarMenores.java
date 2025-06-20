package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A1");
        maquina.agregarCelda("A2");
        maquina.agregarCelda("B1");
        maquina.agregarCelda("B2");
        maquina.agregarCelda("C1");
        maquina.agregarCelda("C2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("D456","Chicle",0.10);
		maquina.cargarProducto(producto2, "A2", 6); 
		
		Producto producto3=new Producto("F896","Chupete",0.15);
		maquina.cargarProducto(producto3, "B1", 6); 
		
		Producto producto4=new Producto("A476","Cachitos",0.50);
		maquina.cargarProducto(producto4, "B2", 6); 
		
		Producto producto5=new Producto("K336","Doritos",0.70);
		maquina.cargarProducto(producto5, "C1", 6); 
		
		Producto producto6=new Producto("TR70","Chocolate",0.30);
		maquina.cargarProducto(producto6, "C2", 6); 
		
		
		ArrayList<Producto> lista =maquina.buscarMenores(0.6);
		
		System.out.println("Productos Menores: "+lista.size());
		for(int i=0;i<lista.size();i++) {
			System.out.println("Nombre: "+lista.get(i).getNombre()+" Precio: "+lista.get(i).getPrecio());
		}

	}

}
