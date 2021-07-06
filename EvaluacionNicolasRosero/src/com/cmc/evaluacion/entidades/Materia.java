package com.cmc.evaluacion.entidades;

public class Materia {

	private String nombre;
	private String codigo;
	private int maximoAlumnos;
	private int minimoAlumnos;
	private int numAlumnos;
	
	public Materia(String nombre, String codigo, int maximoAlumnos) {
		//super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.maximoAlumnos = maximoAlumnos;
		this.minimoAlumnos = 5;
	}
	public Materia(String nombre, String codigo, int maximoAlumnos, int minimoAlumnos) {
		//super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.maximoAlumnos = maximoAlumnos;
		this.minimoAlumnos = minimoAlumnos;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getMaximoAlumnos() {
		return maximoAlumnos;
	}
	public void setMaximoAlumnos(int maximoAlumnos) {
		this.maximoAlumnos = maximoAlumnos;
	}
	public int getMinimoAlumnos() {
		return minimoAlumnos;
	}
	public void setMinimoAlumnos(int minimoAlumnos) {
		this.minimoAlumnos = minimoAlumnos;
	}
	public int getNumAlumnos() {
		return numAlumnos;
	}
	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	public void imprimir(){
		System.out.println("*** "+ codigo+" "+ nombre+" ***");
		System.out.println("ALUMNOS: max>>"+maximoAlumnos+" min>>"+minimoAlumnos+" actual>>"+numAlumnos);
	}
	
}
