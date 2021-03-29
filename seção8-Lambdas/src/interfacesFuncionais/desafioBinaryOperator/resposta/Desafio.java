package interfacesFuncionais.desafioBinaryOperator.resposta;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import interfacesFuncionais.desafioBinaryOperator.Produto;

public class Desafio {

	public static void main(String[] args) {
		

		//calcula o desconto
		Function<Produto, Double> precoFinal = 
				p -> p.preco * (1 -p.desconto);
		
		//calcula o imposto
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		//calcula o preço do frete
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		//arredonda o valor
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
				
		//coloca cifrão e reais no valor		
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");
		
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preço final é " + preco);
		
		
	}

	
}
