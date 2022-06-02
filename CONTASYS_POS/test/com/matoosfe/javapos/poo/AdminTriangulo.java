/**
 * 
 */
package com.matoosfe.javapos.poo;

/**
 * Clase que permitira administrar las operaciones del cuadrado
 * @author xtratech
 *
 */
public class AdminTriangulo implements IAdminFiguraGeometrica{

	private int lado;
	private int base;
	private int altura;
	
	public AdminTriangulo(int lado, int base, int altura) {
		this.lado = lado;
		
	}
	
	@Override
	public double calcularPerimetro() {
		double perimetoTriangulo = lado  + lado + lado;
		return perimetoTriangulo; 
	}

	@Override
	public double calcularArea() {
		double areaTriangulo = (base*altura)/2;
		return areaTriangulo;
	}

	@Override
	public void dibujar() {
		System.out.println("Triangulo dibujado");
	}

	@Override
	public void mover(int x, int y) {
		System.out.println("Triangulo movido en x y y: ("+ x + "," + y +")");
	}

}
