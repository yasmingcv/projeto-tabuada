 package br.senai.sp.jandira.model;

public class Calculo {
	
	//atributos
	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	
	//metodos
	public int getTabuada() {
		while (minMultiplicador < maxMultiplicador) {
			return multiplicando * minMultiplicador;
			minMultiplicador++;
		}
		
	public void limpar() {
		
	}
	 	
}
}