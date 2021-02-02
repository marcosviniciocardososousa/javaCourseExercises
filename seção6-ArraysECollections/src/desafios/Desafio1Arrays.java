package desafios;

import java.util.Scanner;
/**
 * 
 * @author marcos sousa
 *
 */

public class Desafio1Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas: ");
		int nNotas = input.nextInt();
		
		double[] notas = new double[nNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota "+(i+1)+" por favor: ");
			notas[i] = input.nextDouble();
		}
		
		double total = 0;
		for (double nota : notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println("Média: "+media);
		
		
		
		input.close();
	}

}
