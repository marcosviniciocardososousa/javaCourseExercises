package encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		//System.out.println(esposa.segredo); //não conseguimos ver esse por ser privado
		System.out.println(esposa.facoDentroDeCasa); //conseguimos ver esse por morar dentro da mesma casa
		System.out.println(esposa.formaDeFalar); //conseguimos ver esse por estarmos dentro do mesmo pacote, como está nom mesmo pacote não precisamos herdar.
		System.out.println(esposa.todosSabem); //todo mundo pode ver.
	}
	
}
