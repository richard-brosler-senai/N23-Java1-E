package br.com.senaisp.bauru.richard.secao07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Desenho extends JPanel {
	//Campos
	private int posX;
	private int posY;
	private Color cor;
	private static int qtdeInst = 0;//quantidade de instâncias
	private static final long serialVersionUID = 1L;
	//Constructor
	public Desenho(int pX, int pY, Color pC) {
		qtdeInst++; //qtdeInst = qtdeInst + 1
		posX = pX;
		posY = pY;
		cor = pC;
	}
	//Métodos
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public Color getCor() {
		return cor;
	}
	public void setCor(Color cor) {
		this.cor = cor;
	}
	protected static int getQtdeInst() {
		return qtdeInst;
	}
	//Só vai ser implementado nas classes filhas
	protected abstract void desenhar(Graphics g);
	//Esse método (paint) é chamado no momento da 
	//montagem do visual da tela
	@Override
	public void paint(Graphics g) {
		desenhar(g);
	}
}
