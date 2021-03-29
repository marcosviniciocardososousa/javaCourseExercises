package interfacesFuncionais.predicateExemplo;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {

		//predicado é uma interface funcional que retorna verdadeiro ou false.
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		//se for verdade nos 2 casos então retorna verdadeiro
		System.out.println(isPar.and(isTresDigitos).test(122));
		
		//o negate nega o resultado orignal e o converte para o seu oposto.
		System.out.println(isPar.and(isTresDigitos).negate().test(123));
		
		//caso algum seja verdadeiro então se torna verdadeiro
		System.out.println(isPar.or(isTresDigitos).test(123));
		
		
		
		
	}

}
