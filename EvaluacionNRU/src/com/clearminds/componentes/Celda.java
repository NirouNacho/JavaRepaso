package com.clearminds.componentes;

public class Celda {

	private Producto producto;
	private int stock;
	private String codigo;
	
	public Celda(String codigo) {
		//super();
		this.codigo = codigo;
	}
	
	
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public Producto getProducto() {
		return producto;
	}


	
	



	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}



	public void ingresarProducto(Producto p, int stockInicial){
		this.producto=p;
		this.stock=stockInicial;
	}



	
}
