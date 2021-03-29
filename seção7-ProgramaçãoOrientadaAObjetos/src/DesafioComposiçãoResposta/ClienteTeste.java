package DesafioComposiçãoResposta;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("João");
		
		Compra compra1 = new Compra();
		var compra2 = new Compra();
		
		//criando os itens da compra
		compra1.adicionarItem("Lápis", 1.25, 100);
		compra1.adicionarItem("caneta", 2, 100);
		
		compra2.adicionarItem("Borracha", 1, 200);
		compra2.adicionarItem("Cola", 4, 100);
		
		
		//associando essas compras ao cliente
		cliente.adicionarCompras(compra1);
		cliente.adicionarCompras(compra2);
		
		//obter valor total
		System.out.println(cliente.obterValorTotal());
		
		
		
		
		
		
		
	}

}
