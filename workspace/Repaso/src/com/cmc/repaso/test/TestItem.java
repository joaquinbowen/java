package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item p1 = new Item("Hellou");
		Item p2 = new Item("aaaaa");
		
		p1.setProductosActuales(20);
		p2.setProductosActuales(100);
		p1.imprimir();
		p2.imprimir();
		
		p1.vender(7);
		p1.devolver(3);
		p1.imprimir();
		
		p2.vender(32);
		p2.devolver(12);
		p2.vender(10);
		p2.imprimir();
		
	}

}
