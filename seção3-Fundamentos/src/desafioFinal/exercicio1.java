package desafioFinal;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em cº: ");
		float c = input.nextFloat();
		
		float f = (c * 1.8f) + 32;
		
		System.out.println("Fº: "+ f);
		
		
		input.close();
	}

}
