package exemploSemGenerics;

public class Main {

	public static void main(String[] args) {

		//EXEMPLO 1
		ExemploBasicoSemGenerics caixaA = new ExemploBasicoSemGenerics();
		caixaA.aguardar(2.3);
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		//------------------------------
		//EXEMPLO 2
		ExemploBasicoSemGenerics caixaB = new ExemploBasicoSemGenerics();
		caixaB.aguardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
	}

}
