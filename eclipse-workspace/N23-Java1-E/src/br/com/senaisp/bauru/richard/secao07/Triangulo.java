package br.com.senaisp.bauru.richard.secao07;

import java.awt.Color;
import java.awt.Graphics;
//Final não vai permitir ter classes filhas (selo classe)
public final class Triangulo extends Desenho {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Campos
	private int altura;
	private int largura;
	//Constructor
	public Triangulo(int pX, int pY, int pAlt, 
					 int pLar, Color pC) {
		super(pX,pY,pC);
		altura = pAlt;
		largura = pLar;
	}
	@Override
	protected void desenhar(Graphics g) {
		//Setando a cor
		g.setColor(getCor());
		//Criando o caminho para desenhar
		int[] pXs = {getPosX(), 
				     getPosX() + largura/2,
					 getPosX() + largura};
		int[] pYs = {getPosY() + altura, 
					 getPosY(),
				     getPosY() + altura};
		//Chamando o preenchimento
		g.fillPolygon(pXs,pYs,3);
		
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}

}
