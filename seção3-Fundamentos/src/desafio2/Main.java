package desafio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//variáveis e objetos
				Double val1, val2, val3, media;
				Scanner input = new Scanner(System.in);

				System.out.print("Informe o 1 salário: ");
				String salario1 = input.next().replaceAll(",", ".");
				
				System.out.print("Informe o 2 salário: ");
				String salario2 = input.next().replaceAll(",", ".");
				
				System.out.print("Informe o 3 salário: ");
				String salario3 = input.next().replaceAll(",", ".");

				val1 = (Double.parseDouble(salario1));
				val2 = (Double.parseDouble(salario2));
				val3 = (Double.parseDouble(salario3));

				media = (val1 + val2 + val3) / 3;

				System.out.println(media);

				input.close();
	}

}
