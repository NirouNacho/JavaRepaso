package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class Ejemplo4 {

	public static void main(String[] args) {
		ArrayList<Persona> personas=new ArrayList<Persona> ();
		
		personas.add(new Persona("Hulk",12));
		personas.add(new Persona("Spiderman",14));
		
		Persona p = new Persona("Mujer Maravilla",23);
		personas.add(p);
		
		
	}

}
