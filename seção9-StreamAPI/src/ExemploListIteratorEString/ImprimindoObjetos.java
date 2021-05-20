package ExemploListIteratorEString;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Lucas", "Ana");
		
		//formas de imprimir os dados da lista
		
		System.out.println("Usando foreach");
		for(String nomes : aprovados) {
			System.out.println(nomes);
		}
		System.out.println();
		
		System.out.println("Usando Iterator");
		Iterator<String> recebe = aprovados.iterator();
		while(recebe.hasNext()) {
			System.out.println(recebe.next());
		}
		System.out.println();
		
		System.out.println("Usando Stream");
		Stream<String> stream  = aprovados.stream();
		stream.forEach(System.out::println);
		
		
	}

}
