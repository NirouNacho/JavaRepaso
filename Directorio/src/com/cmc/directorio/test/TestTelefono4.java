package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono tel1= new Telefono("movi","098234234",20);
		Telefono tel2= new Telefono("movi","098234234",20);
		Telefono tel3= new Telefono("claro","0981234234",20);
		Telefono tel4= new Telefono("claro","09812323234",20);
		
		AdminTelefono admin = new AdminTelefono();
		int contadorClaro=admin.contarClaro(tel1,tel2,tel3,tel4);
		
		System.out.println("Telefonos claro: "+contadorClaro);
	}

}
