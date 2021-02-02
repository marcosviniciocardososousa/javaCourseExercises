package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];
		}
		
		System.out.println(totalA / notasAlunoA.length);
		System.out.println(notasAlunoA.length);
		
		//=======================================================================
		
		
		double[] notasAlunoB = { 6.9 , 8.9 , 5.5 , 10 };
		
		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];
		}
		
		System.out.println(totalB / notasAlunoB.length);
		
		
		
	}

}
