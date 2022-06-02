package com.matoosfe.javapos.fundamento;

public class TestModificador {
	private int valorPrivado;
	public String valorPublico;
	double valorPaquete;
	protected boolean valorProtegido;
	
	private int llamarMetodoPrivado(int valorSumar) {
		return valorPrivado = valorSumar ;
	}
	
	public String llamarMetodoPublico(String valorConcatenar) {
		return valorPublico = valorConcatenar ;
	}

	public double llamarMetodoPaquete(double valorSumar) {
		return valorPaquete = valorSumar;
	}
	
	protected boolean llamarMetodoProtegido() {
		return valorProtegido;
	}
}
