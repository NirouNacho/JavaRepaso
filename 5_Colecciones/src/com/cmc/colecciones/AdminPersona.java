package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Persona;

public class AdminPersona {

	private ArrayList<Persona> personas;
	
	public AdminPersona(){
		personas= new ArrayList<Persona>();
	}
	
	public void agregar(Persona persona){
		personas.add(persona);
	}

	
	public void imprimir(){
		Persona per=null;
		for (int i=0;i<personas.size();i++){
			per=personas.get(i);
			System.out.println("Nombre: "+per.getNombre()+
					"Apellido: "+per.getEdad());
		}
	}
	
	public Persona buscar(String nombre){
		Persona per;
		for (int i=0;i<personas.size();i++){
			per= personas.get(i);
			if(per.getNombre().equals(nombre)){
				return per;
			}
		}
		return null;
	}
}
