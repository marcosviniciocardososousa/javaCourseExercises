package DesafioComposiçãoResposta;

import java.util.ArrayList;

public class Cliente {
	
	ArrayList<Compra> compras = new ArrayList<Compra>();
	String nome;
	
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	public void adicionarCompras(Compra compra) {
		compras.add(compra);
	}
	public double obterValorTotal() {
		Double total = 0.0;
		
		for(Compra compra : compras) {
			total += compra.valorTotal();
		}
		
		return total;
	}
	

}
