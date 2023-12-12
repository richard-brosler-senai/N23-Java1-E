package br.com.senaisp.bauru.richard.secao02;

public class CalculosMatematicos {
	/**
	 * Fun��o que inverte um valor inteiro.
	 * @param valor Dever� ser informado um valor inteiro.
	 * @return Retorna o valor passado invertido.
	 */
	public int inverterValor(int valor) {
		//123 passado resulta em 321
		//S� poder� usar Soma, Multiplica��o,
		//Divis�o e Resto
		int ret = 0;
		int c = valor / 100;
		int d = valor % 100 / 10;
		int u = valor % 10;
		ret = u * 100 + d * 10 + c;
		return ret;
	}
	/**
	 * Fun��o que converte graus Fahrenheit para Celsius.
	 * @param value Temperatura em Fahrenheit.
	 * @return Retorna a temperatura em Celsius.
	 */
	public double fahrenheit2Celsius(double value) {
		double ret = ( value - 32 ) * 5 / 9;
		
		return ret;
	}
	
	public double delta(double a, double b, double c) {
		//Math.pow => exponencia��o
		return Math.pow(b, 2) - 4 * a * c; 
	}
	
	public void calcularX(double delta, double a, double b) {
		if (delta<0) {
			System.out.println("N�o � poss�vel "
					+ "calcular X1 e X2.");
		} else {
			double x1 = ( -b + Math.sqrt(delta) ) / ( 2 * a);
			double x2 = ( -b - Math.sqrt(delta) ) / ( 2 * a);
			System.out.println("O valor de x1 � " + x1);
			System.out.println("O valor de x2 � " + x2);
		}
	}
}
