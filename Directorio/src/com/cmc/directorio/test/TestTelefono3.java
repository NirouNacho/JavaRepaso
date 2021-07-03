package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono tel1= new Telefono("movi","098234234",20);
		Telefono tel2= new Telefono("movi","098234234",20);
		Telefono tel3= new Telefono("claro","0981234234",20);
		
		AdminTelefono admin = new AdminTelefono();
		int contadorMovi=admin.contarMovi(tel1,tel2,tel3);
		
		System.out.println("Telefonos movi: "+contadorMovi);
	}

}
