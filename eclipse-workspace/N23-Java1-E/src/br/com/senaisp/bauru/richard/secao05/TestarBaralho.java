package br.com.senaisp.bauru.richard.secao05;

public class TestarBaralho {

	public static void main(String[] args) {
		Baralho bar = new Baralho();
		Carta ct = bar.getCartaSorteada();
		System.out.println(ct.toString());
	}

}
