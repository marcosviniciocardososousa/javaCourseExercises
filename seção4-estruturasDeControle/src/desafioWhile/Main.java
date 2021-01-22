package desafioWhile;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float recebe = 0, contador = 1, notas = 0;

		do {
			System.out.print("Informe uma nota: ");
			recebe = input.nextFloat();
				while(recebe < -1 || recebe > 10) {
					System.out.print("Informe um valor válido: ");
					recebe = input.nextFloat();
				}
				if(recebe == -1) {
					break;
				}

			notas = notas + recebe;

			System.out.printf("Média atual: %.2f \n", notas / contador);

			contador++;
		} while (recebe != -1);

		System.out.println("Fim da execução!");

		input.close();
	}

}
