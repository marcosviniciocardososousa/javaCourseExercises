package interfaces.aula2ClasseAbstrata;

public class Cachorro extends Mamifero{

	/**
	 * A única classe que podemos instânciar e a classe cachorro, porque ela é a única classe concreta.
	 */
	
	@Override
	public String mamar() {
		return "Usando leite";
	}


}
