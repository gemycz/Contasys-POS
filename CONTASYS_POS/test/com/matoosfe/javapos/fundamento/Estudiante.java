//Primer elemento a considerarse en la estructura de un programa
package com.matoosfe.javapos.fundamento;

import java.util.Date;
import java.util.*;

/*Importacion de las librerías
*/

//3er elememto definición de la clase
public class Estudiante {

	//caracteristicas del objeto
	private String nombreEst;
	private String apellidosEst;
	private String identificacionEst;
	private int edadEst;
	private Date fechaEst;
	private float pesoEst;
	private double alturaEst;
	
	
	//definicion de constructor
	
	public Estudiante (){
		
	}


	public Estudiante(String nombreEst, String apellidosEst, String identificacionEst, int edadEst, Date fechaEst,
			float pesoEst, double alturaEst) {
	
		this.nombreEst = nombreEst;
		this.apellidosEst = apellidosEst;
		this.identificacionEst = identificacionEst;
		this.edadEst = edadEst;
		this.fechaEst = fechaEst;
		this.pesoEst = pesoEst;
		this.alturaEst = alturaEst;
	}


	public String getNombreEst() {
		return nombreEst;
	}


	public void setNombreEst(String nombreEst) {
		this.nombreEst = nombreEst;
	}


	public String getApellidosEst() {
		return apellidosEst;
	}


	public void setApellidosEst(String apellidosEst) {
		this.apellidosEst = apellidosEst;
	}


	public String getIdentificacionEst() {
		return identificacionEst;
	}


	public void setIdentificacionEst(String identificacionEst) {
		this.identificacionEst = identificacionEst;
	}


	public int getEdadEst() {
		return edadEst;
	}


	public void setEdadEst(int edadEst) {
		this.edadEst = edadEst;
	}


	public Date getFechaEst() {
		return fechaEst;
	}


	public void setFechaEst(Date fechaEst) {
		this.fechaEst = fechaEst;
	}


	public float getPesoEst() {
		return pesoEst;
	}


	public void setPesoEst(float pesoEst) {
		this.pesoEst = pesoEst;
	}


	public double getAlturaEst() {
		return alturaEst;
	}


	public void setAlturaEst(double alturaEst) {
		this.alturaEst = alturaEst;
	}
	
	//generar metodos 
	
}
