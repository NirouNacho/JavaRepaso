package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> lista=new ArrayList<String> ();
			ArrayList<Persona> listaPersonas=new ArrayList<Persona> ();
			
			lista.add("cc");
			listaPersonas.add(new Persona("a", 12));
			String a= lista.get(0);
	}

}
