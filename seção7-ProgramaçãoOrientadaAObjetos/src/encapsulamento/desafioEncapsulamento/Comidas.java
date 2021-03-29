package encapsulamento.desafioEncapsulamento;

public abstract class Comidas {

	protected double peso;

	public Comidas(double peso) {
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
	
	
}
