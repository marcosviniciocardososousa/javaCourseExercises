package ExcecaoPersonalizadaA;

@SuppressWarnings("serial")
public class NumeroForaDoIntervaloException extends RuntimeException{

	/**
	 * 1 - passo extender RuntimeException
	 * 2 - cria um construtor
	 * 3 - sobrescrever o método getMessage
	 */
	
	private String nomeDoAtributo;
	
	public NumeroForaDoIntervaloException (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está fora do intervalo"
				, nomeDoAtributo);
	}		
	
}
