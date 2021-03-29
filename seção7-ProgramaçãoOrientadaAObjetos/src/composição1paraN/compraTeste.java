package composição1paraN;

public class compraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();
		c1.cliente = "João Pedro";
		
		c1.addItem("lapis", 10, 2.5);
		c1.addItem("Borracha", 7, 1);
		
		System.out.println(c1.qtdItem()); //retorna a quantidade de itens da lista.
		System.out.println(c1.obterValorTotal());
		
	}

}
