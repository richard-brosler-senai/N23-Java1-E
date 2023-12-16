package br.com.senaisp.bauru.richard.secao07;

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo extends Desenho {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//campos
	private int comprimento;
	private int largura;
	//constructor
	public Retangulo(int pX, int pY, int pCom, 
			int pLar, Color pC) {
		//Chamando o constructor da superclasse
		super(pX, pY, pC);
		comprimento = pCom;
		largura = pLar;
	}
	@Override
	protected void desenhar(Graphics g) {
		//Setando a cor para desenhar
		g.setColor(getCor());
		//Começando meu desenho
		g.fillRect(getPosX(), getPosY(), 
					comprimento, largura);
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}

}
