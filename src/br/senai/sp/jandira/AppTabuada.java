package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.*;
public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.altura = 600;
		tela.largura = 470;
		tela.titulo = "Tabuada";
		tela.criarTela();
		
		Tabuada tabuada = new Tabuada();
		
		tabuada.multiplicando = 9;
		tabuada.minMultiplicador = 8;
		tabuada.maxMultiplicador = 10;
		
		String[] resultado = tabuada.getTabuada();
		
		int i = 0;
		
		while(i < resultado.length) {
			System.out.println(resultado[i]);
			i++;
		}

	}

}
