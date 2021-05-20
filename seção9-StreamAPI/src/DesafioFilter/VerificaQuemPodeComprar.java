package DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class VerificaQuemPodeComprar {

	public static void main(String[] args) {

		Comprador c1 = new Comprador("alex", 1500, false);
		Comprador c2 = new Comprador("joão", 1800, true);
		Comprador c3 = new Comprador("guilherme", 1000, false);
		Comprador c4 = new Comprador("matheus", 2500, true);
		Comprador c5 = new Comprador("samuel", 2800, true);
		Comprador c6 = new Comprador("alexandre", 5500, true);
		Comprador c7 = new Comprador("ricardo", 1100, false);
		Comprador c8 = new Comprador("marcos", 1800, false);
		
		List<Comprador> compradores = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8);
		
		Stream<Comprador> verificaSeEBomCliente = compradores.stream();
		
		Predicate<Comprador> verificaDinheiroGasto = 
				dinheiroGasto -> dinheiroGasto.dinheiroQueGastou > 1100;
		Predicate<Comprador> verificaSpc = 
				estaNoSpc -> estaNoSpc.oNomeEstaNoSPC == false;
		
		verificaSeEBomCliente
			.filter(verificaDinheiroGasto)
			.filter(verificaSpc)
			.forEach(System.out::println);
		;
		
	}

}
