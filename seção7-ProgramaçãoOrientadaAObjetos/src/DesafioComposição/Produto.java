package DesafioComposição;

public class Produto {
	
	Double preco;
	String nome;
	Item item;
	
	public Produto(String nome, Double preco) {
		this.preco = preco;
		this.nome  = nome;
		item = new Item();
	}
	
	

}
