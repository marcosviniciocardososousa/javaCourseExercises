package DesafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		/**
		 * 1. Número para string binária
		 * 2. Inverter a String
		 * 3. Converter de volta para inteiro.
		 */
		
		Function<Integer, String> converteParaBinario = 
				num -> Integer.toBinaryString(num)
					;
		Function<String, Integer> converteBinarioParaString = 
				num -> Integer.parseInt(num,2)
					;
		UnaryOperator<String> inverteString = 
			 	 valString -> new StringBuilder(valString).reverse().toString();
			 	 
		
		//--------------------------------
		System.out.println("Inicial:");
		nums.forEach(System.out::println);
		System.out.println();
				
		System.out.println("Convertido para binário:");
		nums.stream()
				.map(converteParaBinario)
				.forEach(System.out::println);
		System.out.println();
		
		
		System.out.println("Invertendo String");
		nums.stream()
			.map(converteParaBinario)
			.map(inverteString)
			.forEach(System.out::println);
		
		System.out.println("Volta a String ao normal:");
		nums.stream()
			.map(converteParaBinario)
			.map(inverteString)
			.map(inverteString)
			.map(converteBinarioParaString)
			.forEach(System.out::println);
			;
		
	}

}
