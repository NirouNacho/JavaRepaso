package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacto c = new Contacto("Nico", "mm", new Telefono("claro", "2asdf5", 2223), 0);
		System.out.println(c.toString());
		
		AdminContactos adminC = new AdminContactos();
		
		adminC.activarUsuario(c);
		System.out.println(c.toString());
		
		
		c.getTelefono().setTieneWhatsapp(true);
		
		adminC.activarUsuario(c);
		System.out.println(c.toString());
	}

}
