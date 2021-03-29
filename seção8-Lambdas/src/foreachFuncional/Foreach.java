package foreachFuncional;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
		//asList agrega diretamente os nomes a collection list.
		
		System.out.println("Foreach tradicional...");
		for(String nome : aprovados) {
			System.out.println(nome);
		}
		System.out.println();//quebra a linha
		
		System.out.println("Lambda #01");
		aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});
		System.out.println();//quebra a linha
		
		System.out.println("Lambda #02");
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod reference #01");
		aprovados.forEach(System.out::println);
		// para cada item em aprovados escreva o println respectivo a esse item.
		
		System.out.println("\nMethod reference #02");
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Meu nome é "+nome);
	}
	
	
	
	
}
