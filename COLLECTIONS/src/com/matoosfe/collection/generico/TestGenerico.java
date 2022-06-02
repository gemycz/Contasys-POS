/**
 * 
 */
package com.matoosfe.collection.generico;

import java.util.ArrayList;

/**
 * @author Gemag
 *
 */
public class TestGenerico {

	/**
	 * Método para sumar los valores de una collection, en la cual no se ha definido
	 * un tipo de dato especifico
	 * 
	 * @param listaNumeros* return
	 */
	public int sumarValoresCollection(ArrayList listanumeros) {
		int total = 0;
		for (Object nunTmp : listanumeros) {
			total += (Integer) nunTmp;
		}
		return total;
	}

	/**
	 * Método para sumar los valores de una collection, • utilizando génericos. Lo
	 * cual permite especificar un tipo . de dato que soportará la collection param
	 * ListaNumeros
	 * 
	 * @return
	 */
	public int sumarValoresCollectionGenericos(ArrayList<Integer> listanumeros) {
		System.out.println("Sumar valores utilizando Collection Normal");
		int total = 0;
		for (Integer nunTmp : listanumeros) {
			total += nunTmp;
		}
		return total;
	}
	
	public static void main(String[] args) {
		System.out.println("Sumar valores utilizando Collection Generica");
		ArrayList listaNumeros = new ArrayList();
		listaNumeros.add(5);
		listaNumeros.add(8);
		TestGenerico tesGen = new TestGenerico();
		System.out.println("Valor Obtenido: "+tesGen.sumarValoresCollection(listaNumeros));
		ArrayList<Integer> listaNumerosGenericos = new ArrayList<Integer>();
		listaNumerosGenericos.add(5);
		listaNumerosGenericos.add(8);
		System.out.println("Valor Obtenido: "+tesGen.sumarValoresCollectionGenericos(listaNumerosGenericos));
	}
}
