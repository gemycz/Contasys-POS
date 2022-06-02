/*
 * evelb 23 mar. 2022¨
 * Gema Castillo
 */
package com.matoosfe.javapos.fundamento.modificadores;

/**
 * The Class TestModificadoresComportamiento.
 * Clase para ejemplificar los modificadores de comportamiento
 */
public class TestModificadoresComportamiento {

	public static void main(String[] args) {
		Profesor profesor1 = new Profesor("Pablo", "Mora", "2222222222", null);
		System.out.println("Nombre: "+ profesor1.getNombrePer());
		System.out.println("Apellido prosefor 1: "+ Profesor.getApellidoPer());
		
		Profesor profesor2 = new Profesor("Mauro", "Zambrano", "2222222222", null);
		System.out.println("Nombre: "+ profesor2.getNombrePer());
		
		System.out.println("Nombre: "+ profesor1.getNombrePer());
		System.out.println("Apellido prosefor 2: "+ Profesor.getApellidoPer());
	}
}
