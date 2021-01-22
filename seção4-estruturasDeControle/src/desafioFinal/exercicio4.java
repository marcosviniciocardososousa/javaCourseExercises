package desafioFinal;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contaDiv = 0;
		
		System.out.print("Informe um número para verificarmos se é primo: ");
		int n = input.nextInt();
		
		for(int i = 2; i < n; i++) {
			if (n % i == 0) {
				contaDiv++;
			}
		}
		
		String result = contaDiv == 0 ? "é primo!" : "não é primo!";
		
		System.out.println("O número "+result);

		input.close();
	}

}
