package br.com.senaisp.bauru.richard.secao05;

public class ExercicioString {

	public static void main(String[] args) {
		String email = "roberto@website.com.br";
		System.out.println("O caracter "
				+ "@ est� na posi��o " +
				email.indexOf('@'));
		System.out.print("Mostrando somente o nome: ");
		System.out.println(
			email.substring(0,email.indexOf('@'))
						  );
		System.out.print("Mostrando somente o dom�nio: ");
		System.out.println(
				email.substring(email.indexOf('@')+1)
				);
	}

}
