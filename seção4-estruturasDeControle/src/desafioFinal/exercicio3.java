package desafioFinal;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		float a = input.nextFloat();
		System.out.print("Informe a segunda nota: ");
		float b = input.nextFloat();
		a = (a + b)/2;
		
		String resultado = a >= 7 ? "Aprovado!":
			   	a < 7 && a > 4 ? "Recuperação!":
			   	"Reprovado!";
	
		System.out.println("Resultado: "+resultado);
		
		
		input.close();
	}

}
