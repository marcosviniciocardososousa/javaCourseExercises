package ChaveValorComGenerics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number,V> { //C obrigatoriamente é do tipo number.

	private final Set<Par<C,V>> itens = new LinkedHashSet<>();
	
	public void adicionar(C chave, V valor) {
		if(chave == null) return; //neste caso o return sairá do método.
		
		//se o valor estiver contido ele remove e recoloca ele...
		Par<C, V> novoPar = new Par<C, V>(chave, valor);
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(new Par<C, V>(chave, valor));
		
	}
	
	public V getValor(C chave) {
		if(chave == null) return null;
		
		Optional<Par<C, V>> parOptional = itens.stream()
				.filter(p -> chave.equals(p.getChave()))
				.findFirst();
		return parOptional.isPresent() ? parOptional.get().getValor() : null;
	}
	
	
}
