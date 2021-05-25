package projetoCalculadora.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	/**
	 * O Display e o principal interessado em receber notifica��es de quando a mem�ria mudar
	 */
	void valorAlterado(String novoValor);
	
}
