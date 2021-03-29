package interfacesFuncionais.consumerExemplo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		//recebe um parâmetro mas não retorna nada!
		
		//recebe como parâmetro um objeto do tipo Produto.
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		//objeto p1
		var p1 = new Produto("Caneta", 12.34, 0.25);
		var p2 = new Produto("Lápis", 29.99, 0.03);
		var p3 = new Produto("Borracha", 7.50, 0.10);
		var p4 = new Produto("Caderno", 22.90, 0.12);
		var p5 = new Produto("Livro", 35.99, 0.22);
		
		
		//imprimir.accept(p1);//método que passa o objeto p1 para a interface Consumer.
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		//método #01
		produtos.forEach(imprimir);
		
		//método #02
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);//para funcionar corretamente precisamo configurar o toString
		
	}

}
