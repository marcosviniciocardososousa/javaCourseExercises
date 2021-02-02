package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class EstruturaStackPilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe"); // retorna um valor booleano para falar se adicionou ou não
		livros.push("Don quixote"); 	  //retorna uma excessão caso não seja possivel adicionar
		livros.push("O hobbit");
		
		System.out.println("------------------------------");
		
		for(String livro : livros) {
			System.out.println(livro); // foreach na estrutura stack
		}
		
		System.out.println("------------------------------");
		
		//peek retorna null, element retorna excessão caso não haja itens
		System.out.println(livros.peek()); // vai retornar o último elemento porque o ultimo a entrar e o primeiro a sair LIFO(pilha)
		System.out.println(livros.element()); //igual o peek só que retorna uma excessão ao invés de null
		
		livros.poll();   // vai remover o ultimo a entrar e vai retornar ele
		livros.poll(); 	 // caso não haja excessões ele vai retornar null
		livros.poll();
		livros.poll();
		livros.remove(); //igual o poll, só que retorna uma excessão caso esteja vazio
		
		livros.size(); 					// retorna o tamanho da pilha
		livros.clear();					// limpar a pilha
		livros.contains("Don quixote"); // pesquisar dentro da pilha
		livros.isEmpty();				//verificar se a pilha está vazia
		
		
		
		
		
	}

}
