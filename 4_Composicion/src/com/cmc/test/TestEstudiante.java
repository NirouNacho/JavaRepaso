package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante est= new Estudiante("2342345","Mario");
		est.imprimir();
		Direccion d1 = new Direccion();
		d1.setCallePrincipal("Avenida siempre viva");
		d1.setNumero("Oe1212");
		d1.setCalleSecundaria("Espania");
		
		est.setDireccion(d1);
		
		est.imprimir();
		
		
		Estudiante est2= new Estudiante("212313","Pepe");
		est2.setDireccion(new Direccion("Shyris","ABC","232"));
		est2.imprimir();
	}

}
