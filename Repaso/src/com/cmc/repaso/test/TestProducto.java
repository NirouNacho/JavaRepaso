package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto = new Producto("celular",200);
		
		double precioPromo=producto.calcularPrecioPromo(50);
		
		System.out.println("El precio normal es "+producto.getPrecio());
		System.out.println("El precio con descuento es "+precioPromo);
	}

}
