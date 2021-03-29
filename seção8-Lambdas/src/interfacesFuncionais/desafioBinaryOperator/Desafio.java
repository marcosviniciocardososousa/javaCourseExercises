package interfacesFuncionais.desafioBinaryOperator;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		/**
		 * 1. A partir do produto calculadora o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8.5%)  | < 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: deixar duas casas decimais
		 * 5. Formatar: R$123,56
		 */
		
		BinaryOperator<Double> precoDesconto = 
				(preco, desconto) -> {
					desconto = (preco * (desconto * 100) / 100);
					
					return preco  - desconto;
					
				};
		
		UnaryOperator<Double> impostoMunicipal = 
				preco -> {
					if(preco >= 2500.00) {
						Double imposto = (preco / 100) * 8.5;
						return preco + imposto;
					}else return preco;
				};
				
		UnaryOperator<Double> valorFrete = 
				preco -> {
					if(preco >= 3000) return preco += 100;
					else return preco += 50;
				};
				
		Function<Double, String> arredonda 
		= preco -> {
			String valorFormatado = new DecimalFormat("#,##0.00").format(preco);
			return valorFormatado;
		};
		
		UnaryOperator<String> formata 
		=  preco -> {
			return "R$"+preco;
		};
				
		Double precoComDesconto = precoDesconto.apply(p.preco, p.desconto);
		
		System.out.println("Valor original : "+p.preco);
		System.out.println(
				
				impostoMunicipal.andThen(impostoMunicipal)
				.andThen(valorFrete)
				.andThen(arredonda)
				.andThen(formata)
				.apply(precoComDesconto)
				
				);
		
		
	}
}
