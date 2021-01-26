package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Produto p1 = new Produto("Notebook", 1000);
		
		System.out.println(p1.nome);
		System.out.println((p1.precoDesconto() + p1.precoDesconto())/2);
		Produto.desconto = 0.5;
		System.out.println();
		
		var p2 = new Produto("Caneta",2);
		
		System.out.println(p2.nome);
		System.out.println((p2.precoDesconto() + p2.precoDesconto())/2);
		
		input.close();
	}

}
