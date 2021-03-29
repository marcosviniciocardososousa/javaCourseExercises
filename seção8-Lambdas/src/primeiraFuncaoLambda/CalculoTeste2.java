package primeiraFuncaoLambda;

public class CalculoTeste2 {

	public static void main(String[] args) {
		//AQUI IMPLEMENTAMOS CONCEITOS DE PROGRAMAÇÃO FUNCIONAL.

		Calculo calc = (a , b) -> { return a + b; };
		System.out.println(calc.executar(2, 3));
		
		calc = (a, b) -> a * b;//quando vc não coloca o parênteses automaticamente ele retorna isso.
		System.out.println(calc.executar(2, 3));
		
		
	}

}
