package DesafioComposição;

import java.util.ArrayList;

public class Cliente {
	
	String nome;
	ArrayList<Compra> compras = new ArrayList<Compra>();
	
	public Cliente() {}
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	

}
