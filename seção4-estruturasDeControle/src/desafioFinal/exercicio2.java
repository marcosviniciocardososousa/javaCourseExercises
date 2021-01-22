package desafioFinal;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o ano: ");
		int a = input.nextInt();
		
		String resultado = a % 4 == 0 ? "Ano bisexto!" : "Não é bisexto!";
		System.out.println(resultado);
		
		
		input.close();
	}

}
