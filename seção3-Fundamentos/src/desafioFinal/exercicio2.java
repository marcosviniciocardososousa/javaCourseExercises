package desafioFinal;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Fº: ");
		float f = input.nextFloat();
		
		float c = (f - 32)/1.8f;
		
		System.out.println("Cº: "+ c);
		
		input.close();
	}

}
