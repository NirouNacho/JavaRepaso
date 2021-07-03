package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Telefono telf=new Telefono("movi", "123123", 1);
			Contacto c = new Contacto("Nicolas","Apellido",telf, 123);
		System.out.println(c.toString());
			
	}

}
