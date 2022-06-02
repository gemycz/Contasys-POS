/**
 * 
 */
package com.matoosfe.javapos.poo;

/**
 * Ejemplificar uso de la Herencia.
 *
 * @author xtratech
 */
public class Estudiante extends Persona {
	
	/** The edad estudiante. */
	private int edadEstudiante;
	
	
	/**
	 * Instantiates a new estudiante.
	 *
	 * @param nombreEstudiante the nombre estudiante
	 * @param apellidoEstudiante the apellido estudiante
	 * @param identificacionEstudiante the identificacion estudiante
	 * @param edadEstudiante the edad estudiante
	 */
	public Estudiante(String nombreEstudiante, String apellidoEstudiante, String identificacionEstudiante,
			int edadEstudiante) {
		super(nombreEstudiante, apellidoEstudiante, identificacionEstudiante);
		this.edadEstudiante = edadEstudiante;
	}

	/**
	 * Gets the edad estudiante.
	 *
	 * @return the edad estudiante
	 */
	public int getEdadEstudiante() {
		return edadEstudiante;
	}


	/**
	 * Sets the edad estudiante.
	 *
	 * @param edadEstudiante the new edad estudiante
	 */
	public void setEdadEstudiante(int edadEstudiante) {
		this.edadEstudiante = edadEstudiante;
	}

	/*
	 * 1) Modificador de acceso - tiene que ser menos restrictivo
	 * respecto a la clase hija
	 * 2) Tipo de dato de retorno - tiene que ser el mismo tanto la clase padre como la clase 
	 * hija es decir el tipo de dato 
	 * 3) Nombre del metodo - debe ser el mismo
	 * 4) Firma del metodo - Numero y tipo de argumentos
	 * 5) Control de errores - Excepciones
	 */
	@Override
	public String getNombrePer() {
		// TODO Auto-generated method stub
		return super.getNombrePer() + " Gabriela";
	}
	
	
	
	
}
