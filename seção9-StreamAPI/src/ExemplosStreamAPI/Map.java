package ExemplosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::println;
		
		List<String> marcas = Arrays.asList("BMW ", "AUDI ", "HONDA ");
		
		UnaryOperator<String> maiuscula = n -> n.toLowerCase();
		//UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n + "!!!";
		
		
		//Usando Composição de expressões Lambda
		marcas.stream()
			.map(maiuscula)
			.map(Utilitarios::grito)
			.forEach(print);
		
		
		
	}

}
