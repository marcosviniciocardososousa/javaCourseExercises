package desafioFinalCorreção;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	void apresenta() {
		System.out.println("Peso: "+peso+"\nNome: "+nome+"\n\n");
	}
	
	
}
