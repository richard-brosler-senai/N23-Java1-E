package br.com.senaisp.bauru.richard.secao06;

import java.util.Scanner;

public class TesteFinally {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um valor: ");
			double vlr1 = sc.nextDouble();
			
			System.out.println("Digite outro valor:");
			double vlr2 = sc.nextDouble();
			
			double total = vlr1 / vlr2;
			
			System.out.println("Total = " + total);
		} catch (Exception e) { //Só entra se ocorre erro
			System.out.println("Ocorreu um erro!");
			e.printStackTrace();
		} finally { //sempre passará
			sc.close();
			System.out.println("Passei pelo finally");
		}
		
	}

}
