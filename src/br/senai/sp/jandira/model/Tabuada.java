 package br.senai.sp.jandira.model;

public class Tabuada {
	
	//atributos
	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	public int produto;
	
	//metodos
	public String[] getTabuada() {
		
		int tamanho = maxMultiplicador - minMultiplicador + 1;
		String tabuada[] = new String[tamanho];
		int i = 0;
		
			
		while (minMultiplicador <= maxMultiplicador) {
			produto = multiplicando * minMultiplicador;
			String resultado = multiplicando + " X " + minMultiplicador + " = " + maxMultiplicador;
	
			tabuada[i] = resultado;
			
			
			i++;
			minMultiplicador++;
			}
		
		return tabuada;
			
		
		}
	
	}
