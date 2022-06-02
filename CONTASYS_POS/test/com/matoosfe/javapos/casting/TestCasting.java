/**
 * 
 */
package com.matoosfe.javapos.casting;

/**
 *Clase para ejemplificar el uso de casting ( conversion de tipos )
 * @author xtratech
 *
 */
public class TestCasting {

	/**
	 * Metodo para ejmplificar el uso de casting implicito (automatico)
	 * que permite convertir tipos de menor jerarquia a mayor jerarquia.
	 * Se aplica tanto a primitivos como objetos
	 * byte->int->long->float->double
	 */
	
	public static void probarCastingImplicitoPrimitivos() {
		System.out.println("Casting Implicito primitivos");
		int numeroA = 8;
		double numeroB = numeroA;
		System.out.println("Numero A Casting Implicito "+ numeroB);
	}
	
	public static void probarCastingImplicitoObjetos() {
		
	}
	
	public static void main(String[] args) {
		TestCasting.probarCastingImplicitoPrimitivos();
	}
}
