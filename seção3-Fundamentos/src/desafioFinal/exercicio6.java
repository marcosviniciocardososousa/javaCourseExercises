package desafioFinal;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de A: ");
		float a = input.nextFloat();
		
		System.out.print("DIgite o valor de B: ");
		float b = input.nextFloat();
		
		System.out.print("Digite o valor de C: ");
		float c = input.nextFloat();
		
		float delta = (float)(Math.pow(b, 2) * 4 * a * c);
		
        double x1 = (double) ((-(b) + Math.sqrt(delta)) / 2 * a);
        double x2 = (double) ((-(b) - Math.sqrt(delta)) / 2 * a);
		 
		 System.out.println("X1: "+x1+"\nX2: "+x2);
		
		
		input.close();
	}

}
