/**
 * 
 */
package com.matoosfe.javapos.poo;

/**
 * Tipo de clase que permite definir un comportamiento que sera utilizado
 * por las demas clases.
 * Una clase intefaz solo se utiliza para el comportamiento general pata todas las clases
 * no para su implementacion 
 * Tambien se la conoce como Contrato del negocio
 * Por ejemplo Definir las reglas de los empleados 
 * @author xtratech
 */
public interface IAdminFiguraGeometrica {

	/**
	 * Definicion de metodo para calcular el perimetro de una figura geometrica.
	 *
	 * @return the double
	 */
	public double calcularPerimetro();
	
	/**
	 * Metodo para Calcular area de una figura geometrica.
	 *
	 * @return the double
	 */
	public double calcularArea();	
	
	/**
	 * Metodo para Dibujar la figura geometrica.
	 */
	public void dibujar();
	
	/**
	 *Metodo para Moveer la figura gemetrica.
	 */
	void mover(int x, int y);
	
}
