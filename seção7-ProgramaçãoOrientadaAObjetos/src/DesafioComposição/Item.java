package DesafioComposição;

import java.util.ArrayList;

public class Item {
	
	Integer quantidade;
	Compra compra;
	ArrayList<Produto> produto = new ArrayList<Produto>();
	
	public Item() {
		compra = new Compra();
	}
	

}
