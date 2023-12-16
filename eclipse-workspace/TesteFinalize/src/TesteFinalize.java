

import java.util.Scanner;

public class TesteFinalize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClasseObjeto obj1 = new ClasseObjeto("Teste01");
		String opc;
		System.out.println(obj1.getNome());
		do {
			obj1 = null;
			System.out.println("Digite um sair para sair");
			opc = sc.nextLine();
			obj1 = new ClasseObjeto("Teste " + opc);
		} while (!opc.equalsIgnoreCase("sair"));
		System.out.println(obj1.getNome());
		sc.close();
	}

}
