package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item item = new Item(20);
		
		item.imprimir();
		
		System.out.println("\n vender 13 produtos\n");
		
		item.vender(13);
		item.imprimir();
		
		System.out.println("\n devolver 7 produtos\n");
		
		item.devolver(7);
		item.imprimir();
		
		System.out.println("\n NUEVO ITEM\n");
		
Item item2 = new Item(100);
		
		item2.imprimir();
		
		System.out.println("\n vender 80 produtos\n");
		
		item2.vender(80);
		item2.imprimir();
		
		System.out.println("\n devolver 30 produtos\n");
		
		item2.devolver(30);
		item2.imprimir();
	}

}
