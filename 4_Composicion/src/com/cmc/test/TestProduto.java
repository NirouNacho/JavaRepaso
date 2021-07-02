package com.cmc.test;

import com.cmc.admin.AdminProducto;
import com.cmc.entidades.Producto;

public class TestProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminProducto admin = new AdminProducto();
		Producto prod1 = new Producto("papas", 0.50);
		Producto prod2 = new Producto("doritos", 0.50);
		Producto productCaro= admin.obtenerProductoMasCaro(prod1,prod2);
		if(productCaro==null){
			System.out.println("Es el mismo precio");
		}else{
			System.out.println("El producto mas caro es :"+productCaro.getNombre());

		}
	
	}

}
