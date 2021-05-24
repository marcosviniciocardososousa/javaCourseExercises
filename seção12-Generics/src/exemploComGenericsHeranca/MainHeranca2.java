package exemploComGenericsHeranca;

public class MainHeranca2 {

	public static void main(String[] args) {

		CaixaNumero<Double> caixaA = new CaixaNumero<Double>();
		caixaA.guardar(2.3);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<Integer>();
		caixaB.guardar(212);
		System.out.println(caixaB.abrir());
		
		
	}

}
