package com.cmc.flujo;

public class Validador {

	public void validarEdad(int edad){
		if(edad>18){
			System.out.println("Es mayor de edad");
		}else if(edad<18){
			System.out.println("Es menor de edad");
		}
		else{
			System.out.println("Su edad es 18");
		}
	}
	
	public String validarEdadMsg(int edad){
		
		if(edad>18){
			return "Es mayor de edad";
		}else if(edad==18){
			return "Su edad es 18";
		}else {
			return "Es menor de edad";
		}
		
	}
	
	public boolean esMayoDeEdad(int edad){
		if(edad>=18){
			return true;
		}else {
			return false;
		}
	}
}
