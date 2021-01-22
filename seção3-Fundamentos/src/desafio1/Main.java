package desafio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// variáveis
		float f = 0;
		float c = 0;
			System.out.println();
		// constantes
		final int val1 = 32;
		final float val2 = 5 / 9.0f;

		System.out.print("Informe o valor em F: ");
		f = input.nextFloat();

		c = (f - val1) * val2;

		System.out.println("CONVERTIDO PARA C: " + c);
		
		input.close();

	}

}
