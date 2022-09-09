package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrameTabuada {

	public String titulo;
	public int altura;
	public int largura;
	
	public Color corDoPainel = new Color(255,255,255);
	public Color corDoTitulo = new Color(255, 0, 0);
	public Font fonteTitulo = new Font("Arial", Font.BOLD, 24);
	public Font fonteSubtitulo = new Font("Arial", 1, 11);
	public Color corDoSubtitulo = new Color(120, 120, 120);
	public Font fonteElementos = new Font("Arial", 0, 18);
	public Color corDosElementos = new Color(0, 0, 0);
	public Color corBotaoCalcular = new Color(35, 150, 18);
	public Color corBotaoLimpar = new Color(241, 207, 14);
	
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();
		painel.setBackground(corDoPainel);
		
		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setFont(fonteTitulo);
		labelTitulo.setBounds(60, 0, 300, 50);
		labelTitulo.setForeground(corDoTitulo);
		
		
		JTextArea labelSub = new JTextArea();
		labelSub.setText("Com a tabuada 1.0 seus problemas acabaram. Calcule a tabuada que \ndesejar em segundos!");
		labelSub.setFont(fonteSubtitulo);
		labelSub.setBounds(60, 40, 400, 50);
		labelSub.setForeground(corDoSubtitulo);
		
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(fonteElementos);
		labelMultiplicando.setBounds(100, 100, 200, 50);
		labelMultiplicando.setForeground(corDosElementos);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(250, 110, 150, 30);
		
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo multiplicador:");
		labelMinMultiplicador.setFont(fonteElementos);
		labelMinMultiplicador.setBounds(40, 150, 200, 50);
		labelMinMultiplicador.setForeground(corDosElementos);
		
		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(250, 160, 150, 30);
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo multiplicador:");
		labelMaxMultiplicador.setFont(fonteElementos);
		labelMaxMultiplicador.setBounds(38, 200, 200, 50);
		labelMaxMultiplicador.setForeground(corDosElementos);
		
		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setBounds(250, 210, 150, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setForeground(corDoPainel);
		buttonCalcular.setBackground(corBotaoCalcular);
		buttonCalcular.setBounds(40, 265, 200, 40);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setForeground(corDoPainel);
		buttonLimpar.setBackground(corBotaoLimpar);
		buttonLimpar.setBounds(250, 265, 150, 40);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setFont(fonteElementos);
		labelResultado.setBounds(40, 300, 150, 50);
		
		
		tela.setVisible(true);
		
		painel.add(labelTitulo);
		painel.add(labelSub);
		painel.add(labelMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMultiplicando);
		painel.add(textFieldMinMultiplicador);
		painel.add(textFieldMaxMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		
	}
	
	
}
