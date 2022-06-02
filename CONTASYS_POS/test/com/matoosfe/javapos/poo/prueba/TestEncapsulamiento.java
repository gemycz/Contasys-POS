/**
 * 
 */
package com.matoosfe.javapos.poo.prueba;

import com.matoosfe.javapos.poo.Persona;

/**
 * Esta clase permite ejemplificar el uso del encapsulamiento
 * el encapsulamiento permite la seguridad y el escalamiento en el desarrollo de una aplicación
 * @author xtratech
 *
 */
public class TestEncapsulamiento {

	public static void main(String[] args) {
		
		Persona personaGema = new Persona("Gema", "Castillo", "1313602920");
		
		//imprimir los datos de la persona
		//Ejemplo de una capsula medica
		System.out.println("Datos persona");
		System.out.println("Nombre: "+ personaGema.getNombrePer());
		System.out.println("Apellido: "+ personaGema.getApellidoPer());
		System.out.println("Nombre: "+ personaGema.getIdentificacionPer());
	}
}
