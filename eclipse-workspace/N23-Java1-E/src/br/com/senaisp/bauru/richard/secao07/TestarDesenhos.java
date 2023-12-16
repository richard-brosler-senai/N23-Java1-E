package br.com.senaisp.bauru.richard.secao07;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TestarDesenhos {

	public static void main(String[] args) {
		JOptionPane pnl = new JOptionPane();
		JDialog dlg = pnl.createDialog("Desenhos");
		dlg.setSize(800,600);
		//Criando meus desenhos
		//Desenho des = new Desenho(); Não pode criar 
		Retangulo ret = 
			new Retangulo(10, 10, 400, 200, Color.BLUE);
		
		Quadrado quad = new Quadrado(10, 10, 400, Color.GREEN);
		
		Triangulo tri = 
			new Triangulo(10, 10, 150, 200, Color.RED);
		//Setar o desenho na janela
		dlg.setContentPane(tri);
		System.out.println(ret.getQtdeInst());
		//Mostrando a janela
		dlg.setVisible(true);
	}

}
