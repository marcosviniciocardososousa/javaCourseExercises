package collections;

import java.util.*;

public class EstruturaQueueFila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana"); //adicionar dados em uma fila;
		
		/*
		 * Explicando offer, ele retorna true(se a inserção for bem sucedida) ou false(se for mal sucedida).
		 * Recomendado para filas com tamanho pré definido.
		 * os 2 adicionam elementos, a diferença de comportamento só é notada quando a fila está cheia. 
		 * */
		fila.offer("Carlos");
		fila.add("Marcos");
		fila.add("Samuel");
		fila.offer("zezinho");
		
		
		//  obtem o proximo elemento da fila(sem remover o anterior).
		 
		System.out.println(fila.peek()); // se a fila estiver vazia retorna null
		System.out.println(fila.element()); // se a fila estiver vazia retorna excessão
		
		fila.size(); 			 // retorna o tamanho da fila
		fila.clear(); 			 // limpa a fila
		fila.isEmpty(); 		 // retorna booleano se ela estiver vazia ou cheia.
		fila.poll();			 // retorna o primeiro elemento da fila e remove ele depois. caso não haja mais itens retorna null
		fila.remove(); 			 // se chamar o remove quando a fila estiver vazia vai retornar uma excessão.
		fila.contains("Marcos"); // verifica se um determinado objeto está na fila.
		
		/*
		 * podemos chamar o pool que pega o proximo elemento da fila, retorna ele e tira ele da fila...
		 * implementando assim toda a lógica do funcionamento de uma fila.
		 * */
		
		
		
	}

}
