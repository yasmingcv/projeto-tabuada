package br.senai.sp.jandira.gui;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

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
		labelTitulo.setBounds(70, 0, 300, 50);
		labelTitulo.setForeground(corDoTitulo);
		
		ImageIcon icone = new ImageIcon("src/br/senai/sp/jandira/img/aluna.png");
		JLabel icon = new JLabel(icone);
		icon.setBounds(-15,  0, 100, 70);
		
		
		JTextArea textAreaSub = new JTextArea();
		textAreaSub.setText("Com a tabuada 1.0 seus problemas acabaram. Calcule a tabuada\nque desejar em segundos!");
		textAreaSub.setFont(fonteSubtitulo);
		textAreaSub.setBounds(70, 40, 400, 50);
		textAreaSub.setForeground(corDoSubtitulo);
		textAreaSub.setEditable(false);
		
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(fonteElementos);
		labelMultiplicando.setBounds(100, 100, 200, 50);
		labelMultiplicando.setForeground(corDosElementos);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(250, 110, 150, 30);
		textFieldMultiplicando.setHorizontalAlignment(textFieldMultiplicando.RIGHT);
		
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo multiplicador:");
		labelMinMultiplicador.setFont(fonteElementos);
		labelMinMultiplicador.setBounds(40, 150, 200, 50);
		labelMinMultiplicador.setForeground(corDosElementos);
		
		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(250, 160, 150, 30);
		textFieldMinMultiplicador.setHorizontalAlignment(textFieldMinMultiplicador.RIGHT);
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo multiplicador:");
		labelMaxMultiplicador.setFont(fonteElementos);
		labelMaxMultiplicador.setBounds(38, 200, 200, 50);
		labelMaxMultiplicador.setForeground(corDosElementos);
		
		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setBounds(250, 210, 150, 30);
		textFieldMaxMultiplicador.setHorizontalAlignment(textFieldMaxMultiplicador.RIGHT);
		
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
		
		
		
		JList<String> lista = new JList<>();
		
		
		JScrollPane scroll = new JScrollPane(lista);
		scroll.setBounds(30, 350, 370, 200);
		
		
		
		tela.setVisible(true);
		
		painel.add(labelTitulo);
		painel.add(textAreaSub);
		painel.add(labelMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMultiplicando);
		painel.add(textFieldMinMultiplicador);
		painel.add(textFieldMaxMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(lista);
		painel.add(scroll);
		painel.add(icon);
		
		
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(textFieldMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Multiplicando vazio.");
				}else if(textFieldMinMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Mínimo multiplicador vazio.");
				}else if(textFieldMaxMultiplicador.getText().isEmpty()){
					JOptionPane.showMessageDialog(null, "Máximo multiplicador vazio."); 
				}else if(Integer.parseInt(textFieldMultiplicando.getText()) > 1000 || Integer.parseInt(textFieldMinMultiplicador.getText()) > 1000 || Integer.parseInt(textFieldMaxMultiplicador.getText()) > 1000){
					JOptionPane.showMessageDialog(null, "Os valores devem ser maiores ou iguais à 1000.");
				}else { 
				
					Tabuada tab = new Tabuada();
					tab.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
					tab.minMultiplicador = Integer.parseInt(textFieldMinMultiplicador.getText());
					tab.maxMultiplicador = Integer.parseInt(textFieldMaxMultiplicador.getText());
			
					if(tab.maxMultiplicador < tab.minMultiplicador) {
						JOptionPane.showMessageDialog(null, "Máximo multiplicador não pode ser maior que o mínimo.");
					}
								
					lista.setListData(tab.getTabuada());
				
					scroll.getViewport().add(lista);
								
			}
			}});
		
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textFieldMultiplicando.setText("");
				textFieldMinMultiplicador.setText("");
				textFieldMaxMultiplicador.setText("");
			
				DefaultListModel<String> listaL = new DefaultListModel<>();
				lista.setModel(listaL);
				
				
				
			}
		});
		
		
		
	}
	
	
}
