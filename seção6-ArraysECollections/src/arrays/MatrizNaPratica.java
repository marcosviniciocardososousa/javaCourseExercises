package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrizNaPratica {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Informe a quantidade de alunos da turma: ");
			int nAlunos = input.nextInt();
			System.out.print("Informe a quantidade de notas de cada aluno: ");
			int nNotas = input.nextInt();
			
			double[][] notas = new double[nNotas][nAlunos];
			double soma = 0, somaTurma = 0;
			
			
			int j;
			for (j = 0; j < nAlunos; j++) {
				somaTurma = soma;
				soma = 0;
				for (int i = 0; i < notas.length; i++) {
					System.out.print("Informe a "+(i+1)+" nota do aluno "+(j+1)+" : ");
					soma += notas[i][j] = input.nextDouble();
				}
			System.out.println("Média do aluno "+(j+1)+" = "+(soma/notas.length));
			}
			
			
			System.out.println("Média da turma: "+(somaTurma /  nAlunos));
			
			for(double[] notasAlunos : notas) {
				System.out.println(Arrays.toString(notasAlunos));
			}
			
			input.close();
		}
	}

}
