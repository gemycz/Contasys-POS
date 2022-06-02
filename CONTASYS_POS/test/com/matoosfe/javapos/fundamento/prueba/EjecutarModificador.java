package com.matoosfe.javapos.fundamento.prueba;

import com.matoosfe.javapos.fundamento.TestModificador;

public class EjecutarModificador {
	
	public static void main(String[] args) {
		TestModificador testMetod = new TestModificador();
		
		//private solo se utilizan en la clase que fueron definidos - NO APLICA
//		System.out.println(testMetod.valorPrivado); 
//		System.out.println(testMetod.llamarMetodoPrivado(5));
		
		//public pueden ser utilizados a nivel general o global-universo - 
		System.out.println(testMetod.valorPublico); 
		System.out.println(testMetod.llamarMetodoPublico("java"));
		
		//package solo puede ser utilizado por clases dentro del mismo paquete -  NO APLICA
//		System.out.println(testMetod.valorPaquete); 
//		System.out.println(testMetod.llamarMetodoPaquete(2.3));
		
		//protected rompe la regla de defaultPackage cuando se utiliza la herencia -  NO APLICA
//		System.out.println(testMetod.valorProtegido); 
//		System.out.println(testMetod.llamarMetodoProtegido());
	}
}