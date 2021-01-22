package desafioFinal;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o seu peso: ");
		float peso = input.nextFloat();
		
		System.out.print("Informe a sua altura: ");
		float altura = input.nextFloat();
		
		float imc = peso / (altura * altura);
		
		System.out.println("O IMC é: "+ imc);
		
		
		input.close();
	}

}
