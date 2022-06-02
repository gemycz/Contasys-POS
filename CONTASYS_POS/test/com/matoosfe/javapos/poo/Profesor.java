/**
 * 
 */
package com.matoosfe.javapos.poo;

/**
 * Ejemplificar uso de la Herencia.
 * @author xtratech
 *
 */
public class Profesor extends Persona {
	private String[] listaMateria;
	/**
	 * @param nombreProfesor
	 * @param apellidoProfesor
	 * @param identificacionProfesor
	 * @param listaMateria
	 */
	public Profesor(String nombreProfesor, String apellidoProfesor, String identificacionProfesor,
			String[] listaMateria) {
		super(nombreProfesor, apellidoProfesor, identificacionProfesor);
		this.listaMateria = listaMateria;
	}
	
	
	/**
	 * @return the listaMateria
	 */
	public String[] getListaMateria() {
		return listaMateria;
	}
	/**
	 * @param listaMateria the listaMateria to set
	 */
	public void setListaMateria(String[] listaMateria) {
		this.listaMateria = listaMateria;
	}




}
