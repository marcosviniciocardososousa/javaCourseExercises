package desafioCalculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.print("Informe 1 número: ");
		float n1 = input.nextFloat();
		
		System.out.print("Informe outro número: ");
		float n2 = input.nextFloat();
		
		System.out.println("qual operação deseja realizar? [/ ou % ou * ou + ou -]");
		String sinal = input.next();

		float resultado = "+".equals(sinal) ? n1 + n2 :
					"-".equals(sinal) ? n1 - n2 :
					"*".equals(sinal) ? n1 * n2 :
					"/".equals(sinal) ? n1 / n2 :
					"%".equals(sinal) ? n1 % n2 : 0;
		
		System.out.println("RESULTADO : " + resultado);
		
		
		
		
		input.close();
	}

}
