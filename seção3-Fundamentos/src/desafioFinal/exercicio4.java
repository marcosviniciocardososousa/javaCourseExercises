package desafioFinal;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		double v = input.nextDouble();
		double q,c;
		
		q = Math.pow(v, 2);
		c = Math.pow(v, 3);
		
		System.out.println("ao quadrado: "+q+"\nao cubo: "+c);
		
		
		input.close();
	}

}
