package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
		//colocando de forma explicita o construtor padrão ele volta a existir!
	}
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	double precoDesconto() {
		
		return preco * (1 - desconto);
	}
	double precoDesconto(double descontoGerente) {
		
		return preco * (1 - descontoGerente);
	}
	
}
