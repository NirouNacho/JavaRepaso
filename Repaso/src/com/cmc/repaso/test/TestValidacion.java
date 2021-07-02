package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion valid = new Validacion();
		
		
		boolean resultado = valid.validarMonto(2);
		System.out.println("Monto positivo :" +resultado);
		
	}

}
