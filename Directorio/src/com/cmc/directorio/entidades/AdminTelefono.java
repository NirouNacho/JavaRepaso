package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono telefono){
		if(telefono.getOperadora()=="movi"){
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono tele1,Telefono tel2,Telefono tel3){
		int contadorMovi = 0;
		if(tele1.getOperadora()=="movi"){
			contadorMovi ++;
		}
		if(tel2.getOperadora()=="movi"){
			contadorMovi ++;
		}
		if(tel3.getOperadora()=="movi"){
			contadorMovi ++;
		}
		return contadorMovi;
	}
	
	public int contarClaro(Telefono tele1,Telefono tel2,Telefono tel3,Telefono tel4){
		int contadorClaro = 0;
		if(tele1.getOperadora()=="claro"){
			contadorClaro ++;
		}
		if(tel2.getOperadora()=="claro"){
			contadorClaro ++;
		}
		if(tel3.getOperadora()=="claro"){
			contadorClaro ++;
		}
		if(tel4.getOperadora()=="claro"){
			contadorClaro ++;
		}
		return contadorClaro;
	}
}
