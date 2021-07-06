package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Alumno {
	private String cedula;
	private String nombre;
	private String apellido;

	private ArrayList<Materia> materias;

	public Alumno(String cedula, String nombre, String apellido) {
		// super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Materia buscarMateria(String codMat) {

		Materia mat = new Materia("x", "x", 0);
		for (int i = 0; i < materias.size(); i++) {
			mat = materias.get(i);
			if (mat.getCodigo().equals(codMat)) {
				return mat;
			}
		}
		return null;
	}

	public void agregarMatera(Materia mat) {
		Materia m= new Materia("","",0);
		m=buscarMateria(mat.getCodigo());
		if(m==null){
			materias.add(mat);
		}
	}

}
