/**
 * 
 */
package com.matoosfe.javapos.poo;

/**
 * Clase que permitira administrar las operaciones del cuadrado
 * @author xtratech
 *
 */
public class AdminCuadrado implements IAdminFiguraGeometrica {
	private int lado;
	
	public AdminCuadrado(int lado) {
		this.lado = lado;
		
	}

	@Override
	public double calcularPerimetro() {
		double perimetoCuadrado = lado  + lado + lado + lado;
		return perimetoCuadrado; 
	}

	@Override
	public double calcularArea() {
		double areaCuadrado = Math.pow(lado, 2);
		return areaCuadrado;
	}

	@Override
	public void dibujar() {
		System.out.println("Cuadrado dibujado");
	}

	@Override
	public void mover(int x, int y) {
		System.out.println("Cuadrado movido en x y y: ("+ x + "," + y +")");

	}

}
