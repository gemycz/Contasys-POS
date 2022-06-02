package com.matoosfe.collection;

import java.util.ArrayList;

public class VentajaCollection {

	/**
	 * Método para ejemplificar el uso de las desventajas de un arreglo para
	 * manipular un conjunto de elementos
	 */
	public String[] usoArreglos() {
		// Elementos de un mismo tipo.
		String[] nombres = { "Marco", "Eliana", "Zule" };
		// Tamaño fijo
		System.out.println("Tamaño:" + nombres.length);

		return nombres;
	}

	/**
	 * Método para ejemplificar el uso de las ventajas de las collections para
	 * manipular un conjunto de elementos.
	 * 
	 * @return
	 */

	public ArrayList usoCollections() {
		// Permite almacenar elementos con diferente tipo de dato.
		ArrayList variada = new ArrayList();
		ArrayList variadados = new ArrayList();
		variada.add("Marco");
		variada.add(1);
		variada.add(variadados);
		// Tamaño dinámico
		return variada;
	}

	public static void main(String[] args) {

		VentajaCollection vencol = new VentajaCollection();
		System.out.println("Uso Arreglos");
		String[] numerosMod = vencol.usoArreglos();
		numerosMod[2] = "Otro";
		System.out.println("uso Collections");
		ArrayList variadaMod = vencol.usoCollections();
		variadaMod.add("Otro");
		System.out.println("Tamaño coleccion " + variadaMod.size());
	}

}
