package interfacesFuncionais.operadorBinario;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		
		//expressão lambda que calcula a média (operação binaria)
		BinaryOperator<Double> media = 
				(Double n1, Double n2) -> (n1 + n2) / 2; 
				
		System.out.println(media.apply(9.8, 5.7));
		
		//Lê 2 notas e retorna se o aluno foi aprovado ou não
		//2 tipos de entrada e 1 tipo de retorno!
		BiFunction<Double, Double, String> resultado =
				(n1, n2) -> {
					double notaFinal = ((n1 + n2) / 2);
					return notaFinal >= 7 ? "Aprovado" : "Reprovado";
					
				};
		
		//se passar valores inteiros como parâmetros haverá erro!
		System.out.println(resultado.apply(9.7, 5.1));
		
		//função que recebe média e faz a mesma coisa de resultado só que mais particionado
		Function<Double, String> conceito 
						= m -> m >= 7 ? "Aprovado" :"Reprovado";
		
		System.out.println(media.andThen(conceito).apply(9.7, 5.1));
		
		
	}
	
	
	
}
