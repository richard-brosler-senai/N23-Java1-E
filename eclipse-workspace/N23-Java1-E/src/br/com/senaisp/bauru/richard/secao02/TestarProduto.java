package br.com.senaisp.bauru.richard.secao02;

public class TestarProduto {
	public static String nomePessoa = "Joaquim";
	public static void main(String[] args) {
		Produto prd = new Produto();
		prd.setCodigo(-14);
		System.out.println(prd.getCodigo());
		//Escopo de vari�vel
		//Nesse ponto estou usando o campo
		System.out.println(nomePessoa);
		//A partir daqui ser� vari�vel local sendo usada
		String nomePessoa = "Maria";
		if (prd.getCodigo()>0) {
			nomePessoa = "Roberto";
			System.out.println(nomePessoa);
		}
		System.out.println(nomePessoa);
		
	}

}
