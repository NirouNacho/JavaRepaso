package com.cmc.test;

import com.cmc.colecciones.AdminPersona;
import com.cmc.entidades.Persona;

public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersona admin= new AdminPersona();
		admin.agregar(new Persona("Malcom",10));
		admin.agregar(new Persona("Reese",12));
		admin.imprimir();
		
		
		Persona personaBuscada=admin.buscar("Reese");
		System.out.println("Encontrato:"+ personaBuscada.getNombre());
		
	}

}
