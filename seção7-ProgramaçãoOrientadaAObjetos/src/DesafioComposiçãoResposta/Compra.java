package DesafioComposiçãoResposta;

import java.util.ArrayList;

public class Compra {
	
	ArrayList<Item> itens = new ArrayList<Item>();
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		
		this.itens.add(new Item(new Produto(nome, preco), quantidade));
		
	}
	
	public double valorTotal() {
		double total = 0.0;
		
		for(Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
	
	

}
