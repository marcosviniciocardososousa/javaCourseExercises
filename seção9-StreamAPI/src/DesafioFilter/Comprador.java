package DesafioFilter;

public class Comprador {
	String nome;
	Integer dinheiroQueGastou;
	Boolean  oNomeEstaNoSPC;
	
	public Comprador(String nome, Integer dinheiroQueGastou, Boolean oNomeEstaNoSPC) {
		this.nome = nome;
		this.dinheiroQueGastou = dinheiroQueGastou;
		this.oNomeEstaNoSPC = oNomeEstaNoSPC;
	}

	@Override
	public String toString() {
		return "Comprador [nome=" + nome + ", dinheiroQueGastou=" + dinheiroQueGastou + ", oNomeEstaNoSPC="
				+ oNomeEstaNoSPC + "]";
	}

}
