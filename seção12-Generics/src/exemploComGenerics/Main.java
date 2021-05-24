package exemploComGenerics;

public class Main {

	public static void main(String[] args) {

		ExemploBasicoComGenerics<String> caixaA = new ExemploBasicoComGenerics<String>();
		caixaA.guardar("segredo!");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		ExemploBasicoComGenerics<Double> caixaB = new ExemploBasicoComGenerics<Double>();
		caixaB.guardar(3.1415);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
	}

}
