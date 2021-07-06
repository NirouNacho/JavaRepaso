package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	
	public MaquinaDulces(){
		
	}
	
	public void configurarMaquina(String c1,String c2,String c3,String c4){
		
		celda1.setCodigo(c1);
		celda2.setCodigo(c2);
		celda3.setCodigo(c3);
		celda4.setCodigo(c4);
	}
	

	public void mostrarConfiguracion(){
		System.out.println("CELDA 1:"+celda1.getCodigo());
		System.out.println("CELDA 2:"+celda2.getCodigo());
		System.out.println("CELDA 3:"+celda3.getCodigo());
		System.out.println("CELDA 4:"+celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigoCelda){
		if(celda1.getCodigo()==codigoCelda){
			return celda1;
		}else if(celda2.getCodigo()==codigoCelda){
			return celda2;
		}else if(celda3.getCodigo()==codigoCelda){
			return celda3;
		}else if(celda4.getCodigo()==codigoCelda){
			return celda4;
		}else{
			return null;
		}
	
	}
	
	public void cargarProducto(Producto produc,
			String codigoCelda,int items){
		
		Celda celdaRecuperada=buscarCelda(codigoCelda);
		celdaRecuperada.ingresarProducto(produc, items);
	}
	
	public void mostrarProductos(){
		System.out.println("Celda 1:  Codigo: " +celda1.getCodigo()
		+"Stock Actual:  "+celda1.getStock()
		+" Nombre producto: "+celda1.getProducto().getNombre()
		+" Precio producto: "+celda1.getProducto().getPrecio());
	}
	
	public Producto buscarProductoEnCelda(String codigoCelda){
		Celda c = buscarCelda(codigoCelda);
		if(c!=null){
			return c.getProducto();
		}else{
			return null;
		}
	}
	
	public double consultarPrecio(String codigoCelda){
		Celda c = buscarCelda(codigoCelda);
		return c.getProducto().getPrecio();
	}

	public Celda buscarCeldaProducto(String codigoProducto){
		
		if(celda1.getProducto().getCodigo()==codigoProducto){
			return celda1;
		}else if(celda2.getProducto().getCodigo()==codigoProducto){
			return celda2;
		}else if(celda3.getProducto().getCodigo()==codigoProducto){
			return celda3;
		}else if(celda4.getProducto().getCodigo()==codigoProducto){
			return celda4;
		}else{
			return null;
		}
		
	}
	
	public void incrementarProductos(String codProducto,int itemsIncrementar){
		Celda celdaEncontrada= buscarCeldaProducto(codProducto);
		int stock = celdaEncontrada.getStock()+itemsIncrementar;
		celdaEncontrada.setStock(stock);
	}
	
	public void vender(String codCelda){
		Celda c = buscarCelda(codCelda);
		int stock=c.getStock()-1;
		c.setStock(stock);
		
		double precioVenta= c.getProducto().getPrecio();
		this.saldo=this.saldo+precioVenta;
		mostrarProductos();
		System.out.println("Saldo Maquina:"+this.saldo);
	}
	
	public double venderConCambio(String codCelda,double valorIngresado){
		Celda c=buscarCelda(codCelda);
		vender(c.getCodigo());
		return valorIngresado-c.getProducto().getPrecio();
		
	}
	
}
