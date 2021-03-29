package primeiraFuncaoLambda;

import java.util.ArrayList;

public class CalculoTeste1 {

	public static void main(String[] args) {

		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 3));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("nome1");
		nomes.add("nome2");
		nomes.add("nome3");
		nomes.add("nome4");
		nomes.add("nome5");
		
		for(String nomesBD : nomes) {
			System.out.println(nomesBD);
		}
		
		
	}

}
