package encapsulamento.casaB;

import encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	/*
	//o protected só funciona usando via herança e não via instância.
	Ana mae = new Ana();
	
	void testeAcessos() {
		//System.out.println(esposa.segredo); //não conseguimos ver esse por ser privado
		System.out.println(mae.facoDentroDeCasa); //conseguimos ver esse por morar dentro da mesma casa
		System.out.println(mae.formaDeFalar); //conseguimos ver esse por estarmos dentro do mesmo pacote, como está nom mesmo pacote não precisamos herdar.
		System.out.println(mae.todosSabem); //todo mundo pode ver.
	}
	*/
	
	//forma correta de acessar via herança(protected)
	void testeAcessos() {
		
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		
	}
	
	
}
