package br.com.senaisp.bauru.richard.secao05;

import java.util.Scanner;

public class ExercicioString02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra:");
		String palavra = sc.nextLine(); //ola mundo
		//String palavra2 = sc.next(); se tiver espa�o quebra
		boolean pali = true;//ovo
		int ini=0, fim=palavra.length()-1;
		while(ini<fim) {  //inicio do while
			if (palavra.charAt(ini)!=palavra.charAt(fim)){
				pali = false;
			} //fim do if
			ini++;//ini = ini + 1
			fim--;//fim = fim - 1
		} //fim do while
		System.out.print("A palavra digitada ");
		if (pali) {
			System.out.println("� um palindromo");
		} else {
			System.out.println("n�o � um palindromo");
		}
		sc.close();
	}

}
