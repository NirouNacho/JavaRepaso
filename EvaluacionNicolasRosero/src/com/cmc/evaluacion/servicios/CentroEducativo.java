package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Alumno;
import com.cmc.evaluacion.entidades.Materia;

public class CentroEducativo {

	private ArrayList<Alumno> alumnos;
	private ArrayList<Materia> materias;

	public CentroEducativo() {
		alumnos = new ArrayList<Alumno>();
		materias = new ArrayList<Materia>();
	}

	public boolean matricular(Alumno alumno) {
		String cedulaAl = alumno.getCedula();
		Alumno alExistente = new Alumno(" ", " ", " ");
		alExistente = buscar(cedulaAl);
		if (alExistente == null) {
			alumnos.add(alumno);
			return true;
		} else {

			System.out.println("No se puede matricular un alumno con la misma cedula");
			return false;
		}

	}

	public Alumno buscar(String ced) {
		Alumno al = new Alumno(null, null, "x");
		for (int i = 0; i < alumnos.size(); i++) {
			al = alumnos.get(i);
			if (al.getCedula().equals(ced)) {
				return al;
			}

		}
		return null;
	}
	
	

	public int obtenerCantidadAlumnos() {
		return alumnos.size();
	}

	public void imprimirMatriculados() {
		Alumno al = new Alumno(null, null, "x");
		for (int i = 0; i < alumnos.size(); i++) {
			al = alumnos.get(i);
			System.out.println(al.getCedula() + " " + al.getNombre() + " " + al.getApellido());
		}

	}

	public void actualizarInformacion(Alumno al) {
		Alumno buscar = new Alumno("", "", "");
		buscar = buscar(al.getCedula());
		if (buscar != null) {
			buscar.setNombre(al.getNombre());
			buscar.setApellido(al.getApellido());
		}
	}

	public String generarCodigo(String codMat) {
		String codFinal = "";

		if (codMat.length() >= 3) {
			if(codMat.length()==4){
				codFinal=codMat.substring(0,3);
				return codFinal;
			}
			if (codMat.length() >= 5) {
				codFinal = codMat.substring(0,1) + codMat.substring(2,3) + codMat.substring(4,5);
				
				return codFinal;
			} else {
				return codMat;
			}
		}
		else{
			return null;
		}
	}
	
	public void agregarMateria(String nombreMat,int minEst){
		
		String codGen= generarCodigo(nombreMat);
		int maxAl=3*minEst;
		
		materias.add(new Materia(nombreMat, codGen, maxAl,minEst));
	}
	
	
	public void listarMaterias(){
		Materia mat = new Materia("x", "x", 0);
		for (int i = 0; i < materias.size(); i++) {
			mat = materias.get(i);
			mat.imprimir();
		}
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
	public Alumno buscarAlumno(String cedAl) {

		Alumno al= new Alumno("","","");
		for (int i = 0; i < alumnos.size(); i++) {
			al = alumnos.get(i);
			if (al .getCedula().equals(cedAl)) {
				return al;
			}
		}
		return null;
	}
	
	public void asignarMateria(String codMat,String cedAlm){
		Materia buscarMat= new Materia("","",0);
		buscarMat=buscarMateria(codMat);
		
		Alumno buscarAl= new Alumno("","","");
		buscarAl=buscarAlumno(cedAlm);
		
	}
	
}
