package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante pepito = new Estudiante("pepito");
		
		pepito.calificar(9);
		
		System.out.println(pepito.toString());
		
		pepito.calificar(7);
		
		System.out.println(pepito.toString());
		
	}

}
