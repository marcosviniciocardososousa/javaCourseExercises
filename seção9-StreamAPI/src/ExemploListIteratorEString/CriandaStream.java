package ExemploListIteratorEString;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandaStream {

	public static void main(String[] args) {

		//consumer recebe um parâmetro e não retorna nada
		Consumer<String> print = System.out::print;
		//Exemplo de como atribuir valores a uma stream
		Stream<String> langs = Stream.of("Java ", "Lua ","JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"phyton ","C# ","Ruby ","PHP\n"};
		Stream.of(maisLangs).forEach(print);//substituindo o valor dentro de uma stream
		
		//Outra forma de criar uma stream e usando a classe Arrays
		Arrays.stream(maisLangs).forEach(print);
		//Ele vai pegar de 0 a 3 casa do array (Uma forma de indexar o array por itervalos)
		Arrays.stream(maisLangs, 0,3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "GO ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//Stream.generate(() -> "a").forEach(print);//vai mostrar um monte de A indefinifamente
		Stream.iterate(0, n -> n + 1).forEach(System.out::println);
		
		
	}

}
