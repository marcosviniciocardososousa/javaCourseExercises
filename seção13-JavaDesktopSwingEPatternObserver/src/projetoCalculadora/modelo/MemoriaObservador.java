package projetoCalculadora.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	/**
	 * O Display e o principal interessado em receber notificações de quando a memória mudar
	 */
	void valorAlterado(String novoValor);
	
}
