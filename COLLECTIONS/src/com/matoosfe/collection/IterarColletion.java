/**
 * 
 */
package com.matoosfe.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Gemag
 *
 */
public class IterarColletion {
	/*
	 * Método para mostrar como iterar los elementos de una collection • utilizando
	 * la sentencia for
	 * 
	 * @param ListaNombres
	 */
	public void iterarusandoFor(ArrayList listaNombres) {
		System.out.println("Iterar una collection utilizando el for");
		for (int i = 0; i < listaNombres.size(); i++) {
			System.out.println("Elemento[" + i + "]:" + listaNombres.get(1));
		}
	}

	/**
	 * Método para mostrar como iterar los elementos de una collection utilizando la
	 * sentencia for each
	 * 
	 * @param listaNombres
	 */

	public void iterarusandoForEach(ArrayList listaNombres) {
		System.out.println("Iterar una collection utilizando el for-each");
		for (Object nombreTemp : listaNombres) {
			System.out.println("Elemento: " + nombreTemp);
		}
	}

	/**
	 * Método para mostrar como iterar los elementos de una collection utilizando el
	 * Iterator eparan listaNombres
	 */
	public void iterarUsandoIterator(ArrayList listaNombres) {
		Iterator itNom = listaNombres.iterator();
		while (itNom.hasNext()) {
			System.out.println("Elemento:" + itNom.next());
		}
	}

	public static void main(String[] args) {
		ArrayList listaNombres = new ArrayList();
		listaNombres.add("Evelyn");
		listaNombres.add("Aura");
		listaNombres.add("Vicky");
		listaNombres.add("Margarita");
		IterarColletion itcol = new IterarColletion();
		itcol.iterarusandoFor(listaNombres);
		itcol.iterarusandoForEach(listaNombres);
		itcol.iterarUsandoIterator(listaNombres);
	}

}
