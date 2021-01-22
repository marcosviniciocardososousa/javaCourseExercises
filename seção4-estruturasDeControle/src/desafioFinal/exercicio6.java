package desafioFinal;

import java.util.*;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int r = rand.nextInt(20);
		int contador = 10;
		
		
		do {
			System.out.println(r);
			
			System.out.print("Informe o número que acha que é: ");
			int e = input.nextInt();
			
			if(e == r) {
				System.out.println("Parabéns, você acertou");
				break;
			}else {
				contador--;
				System.out.println("faltam "+contador+" tentativas para perder!");
			}
			
		}while(contador != 0);
		if(contador == 0)System.out.println("Que pena :(\n Você perdeu!");
		
		input.close();
		
	}

}
