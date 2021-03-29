package composição1paraN;

import java.util.ArrayList;

public class Compra {

	String cliente;
	private ArrayList<Item> itens = new ArrayList<Item>();
	
	void addItem(String nome,int quantidade ,double valor) {
		itens.add(new Item(nome, quantidade, valor));
	}
	
	public int qtdItem() {
		return itens.size();
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item : itens ) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
	
	
}
