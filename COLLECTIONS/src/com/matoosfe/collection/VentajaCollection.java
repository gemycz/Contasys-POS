package com.matoosfe.collection;

import java.util.ArrayList;

public class VentajaCollection {

	/**
	 * M�todo para ejemplificar el uso de las desventajas de un arreglo para
	 * manipular un conjunto de elementos
	 */
	public String[] usoArreglos() {
		// Elementos de un mismo tipo.
		String[] nombres = { "Marco", "Eliana", "Zule" };
		// Tama�o fijo
		System.out.println("Tama�o:" + nombres.length);

		return nombres;
	}

	/**
	 * M�todo para ejemplificar el uso de las ventajas de las collections para
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
		// Tama�o din�mico
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
		System.out.println("Tama�o coleccion " + variadaMod.size());
	}

}
