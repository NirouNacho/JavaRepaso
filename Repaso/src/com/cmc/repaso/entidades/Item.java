package com.cmc.repaso.entidades;

public class Item {

	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	
	public Item(String nombre, int productosActuales, int productosDevueltos, int productosVendidos) {
		super();
		this.nombre = nombre;
		this.productosActuales = productosActuales;
		this.productosDevueltos = productosDevueltos;
		this.productosVendidos = productosVendidos;
	}
	
	public Item( int productosActuales){
		this.productosActuales = productosActuales;
	}

	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir(){
		System.out.println("Productos Actuales "+productosActuales);
		System.out.println("Productos Devueltos "+productosDevueltos);
		System.out.println("Productos Vendidos "+productosVendidos);
	}
	
	public void vender(int cantidadVendidos){
		productosVendidos=productosVendidos+cantidadVendidos;
		productosActuales=productosActuales-cantidadVendidos;
	}
	
	public void devolver(int cantidadDevueltos){
		productosVendidos=productosVendidos-cantidadDevueltos;
		productosActuales=productosActuales+cantidadDevueltos;
		productosDevueltos=productosDevueltos+cantidadDevueltos;
	}
	
	
	
}
