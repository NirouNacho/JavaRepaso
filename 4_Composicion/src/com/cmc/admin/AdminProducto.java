package com.cmc.admin;

import com.cmc.entidades.Producto;

public class AdminProducto {

	//comparar; recibir dos parametros de tipo prodcutos
	// va a comparar los precios de los productos
	//retorna el producta de mayor valor
	
	
	public Producto obtenerProductoMasCaro (Producto a, Producto b){
		
		if(a.getPrecio()>b.getPrecio()){
			return a;
		}else if(a.getPrecio()<b.getPrecio()){
			return b;
		}else{
			return null;
		}

	}
}
