package interfacesFuncionais.functionExemplo;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		//Interface que representa uma função que aceita 1 argumento e produz um resultado.
		//o tipo de entrada não precisa ser o mesmo do tipo de saida
		
		//vai recerber um Integer e devolver um String
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "Ímpar";
			
		System.out.println(parOuImpar.apply(10));
		
		//--------------------------------------------------
		//Exemplo de encadeação de Funções
		Function<String, String> oResultadoE = valor -> "O resultado é: "+valor;
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(32);
		System.out.println(resultadoFinal);
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		//encadeando 3 funções.
		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(10);
		System.out.println(resultadoFinal2);
		
		
	}

}
