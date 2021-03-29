package interfacesFuncionais.predicateExemplo;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		//predicado vai retornar um valor booleano.
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		//Produto que será passado como parâmetro
		//15% de desconto 
		var produto = new Produto("Notebook", 3999.99, 0.90);
		
		System.out.println(isCaro.test(produto));
		
		/**
		 * Vai receber um objeto como parâmetro e 
		 * retornar se ele é verdade ou false seguindo as regras que foram informadas
		 */
		
		
		
		
	}
	
}
