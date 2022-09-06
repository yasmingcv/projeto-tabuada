package br.senai.sp.jandira;

import br.senai.sp.jandira.model.*;
public class AppTabuada {

	public static void main(String[] args) {
		
		Tabuada tabuada = new Tabuada();
		
		tabuada.multiplicando = 5;
		tabuada.minMultiplicador = 7;
		tabuada.maxMultiplicador = 10;
		
		String[] resultado = tabuada.getTabuada();
		
		int i = 0;
		
		while(i < resultado.length) {
			System.out.println(resultado[i]);
			i++;
		}

	}

}
