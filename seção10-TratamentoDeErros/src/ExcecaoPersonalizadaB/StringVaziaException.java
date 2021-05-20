package ExcecaoPersonalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception{
	
	/**
	 * 1 - passo extender RuntimeException
	 * 2 - cria um construtor
	 * 3 - sobrescrever o método getMessage
	 */
	
	private String nomeDoAtributo;
	
	public StringVaziaException (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo '%s' está vazio"
				, nomeDoAtributo);
	}
	
}
