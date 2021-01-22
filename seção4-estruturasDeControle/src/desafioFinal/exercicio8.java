package desafioFinal;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um numero: ");
			int valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();
	}

}
