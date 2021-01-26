package desafioFInal;

public class Pessoa {
	String  nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	void comer(double pesoComida) {
		peso += pesoComida;
		
	}

}
