package br.com.senaisp.bauru.richard.secao02;

import java.util.Scanner;

public class TestarBaskhara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A:");
		double a = sc.nextDouble();

		System.out.println("Digite o valor de B:");
		double b = sc.nextDouble();

		System.out.println("Digite o valor de C:");
		double c = sc.nextDouble();
		
		CalculosMatematicos calc = new CalculosMatematicos();
		double delta = calc.delta(a, b, c);
		
		calc.calcularX(delta, a, b);
		sc.close();
	}
}
