package collections;

import java.util.*;

public class EstruturaSetHomogenea {

	public static void main(String[] args) {
		//                             do jeto que está ai é chamado de operador diamond. 
		Set<String> lista = new HashSet<>();//assim ele precisa ser String agora, não aceitando mais qualquer tipo de dado.
		//essa anotação com <...> é chamada de generic's, mesmo deixando o SET mais específico
		
		lista.add("marcos");
		lista.add("pedro");
		lista.add("lucas");
		
		//como agora temos o tipo definido podemos percorrer o set com o foreach
		for(String candidatos : lista) {
			System.out.println(candidatos);
		}
		
		System.out.println();
		
		//assim os dados ficam de forma desordenada, existe a possibilidade de ordenálos por ordem de inserção usando o TreeSet
		SortedSet<String> lista2  = new TreeSet<>();
		lista2.add("marcos");
		lista2.add("pedro");
		lista2.add("lucas");
		lista2.add("ana");
		
		for(String reprovados : lista2) {
			System.out.println(reprovados);
		}
		
		
		
	}

}
