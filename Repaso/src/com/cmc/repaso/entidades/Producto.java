package com.cmc.repaso.entidades;

public class Producto {

	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio<0){
			System.out.println("El precio es negativo");
			this.precio = precio*(-1);
		}else{
			System.out.println("El precio es positivo");
			this.precio = precio;
		}
	}
	
	public double calcularPrecioPromo(double descuento){
		descuento= descuento/100;
		return (this.precio-((this.precio)*(descuento)));
	}
	
	
}
