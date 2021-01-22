package desafioFinal;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n = input.nextInt();
			while(n < 0 || n > 10) {
				System.out.print("Informe um número entre 0 e 10: ");
				n = input.nextInt();
			}
		
		String resultado = n % 2 == 0 ? "É par!" : "É impar!";
		
		System.out.println(resultado);
		
		
		input.close();
	}

}
