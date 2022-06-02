/**
 * 
 */
package com.matoosfe.javapos.poo.prueba;

import com.matoosfe.javapos.poo.AdminCuadrado;
import com.matoosfe.javapos.poo.AdminTriangulo;
import com.matoosfe.javapos.poo.IAdminFiguraGeometrica;

/**
 * Esta clase permite ejemplificar le polimorfismo.
 *
 * @author xtratech
 */
public class TestPolimorfismo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		AdminCuadrado cuadrado = new AdminCuadrado(5);
		AdminTriangulo triangulo = new AdminTriangulo(5, 6, 4);

		TestPolimorfismo testPolimorfismo = new TestPolimorfismo();

		// Operaciones cuadrado
		testPolimorfismo.dibujarGeometrico(cuadrado);
		System.out.println("Perimetro del cuadrado: "+testPolimorfismo.calcularPerimetroGeometrico(cuadrado));

		// Operaciones triangulo
		testPolimorfismo.dibujarGeometrico(triangulo);
		System.out.println("Perimetro del cuadrado: "+testPolimorfismo.calcularPerimetroGeometrico(triangulo));
		
		testPolimorfismo.dibujar("Rombo");
		testPolimorfismo.dibujar("Rombo", "Morado");
	}

	/**
	 * Dibujar geometrico. Metodo para ejemplificar el uso del polimorfismo a nivel
	 * de clases
	 * 
	 * @param figura the figura
	 */
	public void dibujarGeometrico(IAdminFiguraGeometrica figura) {
		figura.dibujar();
	}

	
	/**
	 * Metodo para calcular el perimetro de una figura
	 * Calcular perimetro geometrico.
	 *
	 * @param figura the figura
	 * @return the double
	 */
	public double calcularPerimetroGeometrico(IAdminFiguraGeometrica figura) {
		return figura.calcularPerimetro();
	}

	/*
	 * El proceso de mantener varios metodos con el mismo nombre 
	 * pero cambiando la firma como el numero y tipo de argumentos 
	 * se conoce como sobrecarga
	 * 
	 * La sobrecarga permite manejar la escalabilidad y mantenimiento de una aplicación
	 * Tambien se la conoce como  polimorfismo a nivel de metodos 
	 */
	
	/**
	 * Metodo para Dibujar una figura.
	 *
	 * @param nombreFigura the nombre figura
	 */
	public void dibujar(String nombreFigura) {
		System.out.println("Figura dibujada " + nombreFigura );
		
	}
	
	/**
	 * Metodo para Dibujar una figura pero utilizado otra caracteristica
	 * como el color.
	 *
	 * @param nombreFigura the nombre figura
	 * @param colorFigura the color figura
	 */
	public void dibujar(String nombreFigura, String colorFigura) {
		System.out.println("Figura dibujada " + nombreFigura );
		System.out.println("Color de la figura " + colorFigura );
		
	}
}

