/**
 * 
 */
package com.matoosfe.javapos.poo.prueba;

import com.matoosfe.javapos.poo.Estudiante;
import com.matoosfe.javapos.poo.Profesor;

/**
 * Ejemplificar uso de la Herencia.
 * La herencia permite reutilizar las caracteristicas de las clases padre
 * hacia las clases hijas, evitando la duplicidad del codigo
 * @author xtratech
 *
 */
public class TestHerencia {

	public static void main(String[] args) {
		Profesor profesorMateo = new Profesor("Mateo", "Andrade", "111111111", null);
		Estudiante estudianteGema = new Estudiante("Gema", "Castillo", "1313602920", 25);
		
		System.out.println("Datos Profesor");
		System.out.println("Nombre: "+ profesorMateo.getNombrePer());
		
		System.out.println("Datos Estudiante");
		System.out.println("Nombre: "+estudianteGema.getNombrePer());
	}
}
