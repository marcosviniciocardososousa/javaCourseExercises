package desafioFinal;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0, soma = 0;
		
		while(n >= 0) {
			System.out.print("Informe um número: ");
			n = input.nextInt();
			if(n < 0 )break;
			
			soma += n;
			
		}
		
		System.out.println("SOMA TOTAL: "+soma);
		
		input.close();
	}

}
