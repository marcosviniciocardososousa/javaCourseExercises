package ExemplosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceExemplo1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> soma = (acumulador , n) -> acumulador + n;
		
		//o resultado final de um reduce NÃO é outro stream
		System.out.println(
				nums.stream().reduce(soma).get()
				);
		
		//se for usado paralelStream neste caso, cada thread também herdara o valor 100
		//no final daria 945 ao invés do 145 esperado.
		System.out.println(
				nums.stream().reduce(100, soma)
				);
		//resultado foi um optional <Integer>
		nums.stream()
			.filter(n -> n > 10)
			.reduce(soma)
			.ifPresent(System.out::println);
		
		
		
	}

}
