package br.com.senaisp.bauru.richard.secao01;

import java.util.Scanner;

public class GaloesPorLitrosV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de gal�es:");
		double litrosPorGalao = 3.785;
		double qtdeGaloes = sc.nextDouble();
		double litros = litrosPorGalao * qtdeGaloes;
		System.out.println("Quantidade de litros � " + 
				litros);
		sc.close();
	}

}
