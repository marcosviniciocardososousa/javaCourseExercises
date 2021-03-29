package encapsulamento.desafioEncapsulamento;

public class Pessoa {

	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}else {
			this.peso = 0;
		}
	}
	
	public void comer(Comidas comida) {//recebe qualquer tipo que herde de comida.
		this.peso += comida.getPeso();
	}
	
	
}
