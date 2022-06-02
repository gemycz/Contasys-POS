/*
 * evelb 23 mar. 2022¨
 * Gema Castillo
 */
package com.matoosfe.javapos.poo;

/**
 * Permite ejemplificar el encapsulamiento.
 */
/*
 * Los mofificadores de comportamiento
 * el mofificador final sirve para que una clase, metodo o atributo 
 * no pueda ser modificado ni sobreescrito por ende lo hace seguro
 * 
 * el moficador static no puede utilizarse en las clase, solo se puede
 * aplicar a atributos y metodos 
 */
public class Persona {

	/** The nombre per. */
	private static String nombrePer;
	
	/** The apellido per. */
	private String apellidoPer;
	
	/** The identificacion per. */
	private String identificacionPer;


	/**
	 * Instantiates a new persona.
	 *
	 * @param nombrePer the nombre per
	 * @param apellidoPer the apellido per
	 * @param identificacionPer the identificacion per
	 */
	public Persona(String nombrePer, String apellidoPer, String identificacionPer) {
		this.nombrePer = nombrePer;
		this.apellidoPer = apellidoPer;
		this.identificacionPer = identificacionPer;
	}


	/**
	 * Gets the nombre per.
	 *
	 * @return the nombre per
	 */
	public String getNombrePer() {
		return nombrePer;
	}


	/**
	 * Sets the nombre per.
	 *
	 * @param nombrePer the new nombre per
	 */
	public void setNombrePer(String nombrePer) {
		this.nombrePer = nombrePer;
	}


	/**
	 * Gets the apellido per.
	 *
	 * @return the apellido per
	 */
	public String getApellidoPer() {
		return apellidoPer;
	}


	/**
	 * Sets the apellido per.
	 *
	 * @param apellidoPer the new apellido per
	 */
	public void setApellidoPer(String apellidoPer) {
		this.apellidoPer = apellidoPer;
	}


	/**
	 * Gets the identificacion per.
	 *
	 * @return the identificacion per
	 */
	public String getIdentificacionPer() {
		return identificacionPer;
	}


	/**
	 * Sets the identificacion per.
	 *
	 * @param identificacionPer the new identificacion per
	 */
	public void setIdentificacionPer(String identificacionPer) {
		this.identificacionPer = identificacionPer;
	}




}
