package com.clearminds.test;
import com.clearminds.entidades.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Persona p3 = new Persona();
		Persona p4 = new Persona("mario",23,175.5);
		
		Persona p1; //Declaro la variable p1 de tipo persona
		p1 = new Persona("Juan");//Creo el objeto persona y lo referencio con p1
		System.out.println("nombre :"+ p1.getNombre());
		System.out.println("edad :"+ p1.getEdad());
		System.out.println("estatura :"+ p1.getEstatura());
	
		p1.setNombre("Juan");
		p1.setEdad(20);
		p1.setEstatura(1.75);
		
		System.out.println("nombre :"+ p1.getNombre());
		System.out.println("edad :"+ p1.getEdad());
		System.out.println("estatura :"+ p1.getEstatura());
	
		System.out.println("**************");
		Persona p2;
		p2 = new Persona("Marco");
		System.out.println("nombre :"+ p2.getNombre());
		p2.setNombre("Marco");
		System.out.println("nombre :"+ p2.getNombre());
	}

}
