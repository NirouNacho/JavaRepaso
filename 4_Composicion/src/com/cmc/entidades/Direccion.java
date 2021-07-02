package com.cmc.entidades;

public class Direccion {
	
	private String callePrincipal;
	private String calleSecundaria;
	private String numero;
	
	
	
	public Direccion(String callePrincipal, String calleSecundaria, String numero) {
		//super();
		this.callePrincipal = callePrincipal;
		this.calleSecundaria = calleSecundaria;
		this.numero = numero;
	}
	public Direccion(){
		
	}
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}
