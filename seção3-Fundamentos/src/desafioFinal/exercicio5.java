package desafioFinal;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a base do triângulo: ");
		float b = input.nextFloat();
		
		System.out.println("Informe a altura do triângulo: ");
		float h = input.nextFloat();
		
		float a = (b * h) / 2;
		
		System.out.print("Àrea do triângulo: "+a);
		
		
		input.close();
	}

}
