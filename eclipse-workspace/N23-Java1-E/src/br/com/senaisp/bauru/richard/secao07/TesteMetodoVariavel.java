package br.com.senaisp.bauru.richard.secao07;

import java.util.Random;

public class TesteMetodoVariavel {

	public static void main(String[] args) {
		//Chamando usando parâmetros variáveis
		String nome = getNomeSorteado("Roberto","Maria",
								"Joaquim", "Richard");
		System.out.println(nome);
		
		//Chamando usando método com vetor
		String[] itens = { "Roberto","Maria",
				           "Joaquim", "Richard" };
		
		nome = getNomeSorteadoVetor(itens);
		System.out.println(nome);
	}
	//Método com argumentos variáveis
	public static String 
					getNomeSorteado(String ... nomes) {
		Random rnd = new Random();
		int indice = rnd.nextInt(nomes.length);
		return nomes[indice];
	}
	//Método com argumento usando um vetor
	public static String 
			getNomeSorteadoVetor(String[] nomes) {
		Random rnd = new Random();
		int indice = rnd.nextInt(nomes.length);
		return nomes[indice];
	}
}
