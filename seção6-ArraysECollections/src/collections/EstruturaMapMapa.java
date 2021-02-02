package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class EstruturaMapMapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Marcos");	// ele adiciona se existir e substitui se existir um elemento com a mesma chave
		usuarios.put(1, "joão");
		
		System.out.println(usuarios.size()); 				  // retorna o tamanho do map
		System.out.println(usuarios.isEmpty()); 			  // vai perguntar se o map está vazio (retorna boolean)
		
		System.out.println(usuarios.keySet()); 				  // retorna as chaves que contém
		System.out.println(usuarios.values()); 				  //retorna os valores que contém
		
		System.out.println(usuarios.entrySet());			  //retorna chave-valor de todos os itens do map
		System.out.println(usuarios.containsKey(1)); 		  // pergunta se contém uma certa chave
		System.out.println(usuarios.containsValue("Marcos")); // pergunta se contém um certo valor
		
		System.out.println(usuarios.remove(1));				  //remove a partir da chave
		System.out.println(usuarios.remove(1, "Marcos")); 	  //remover a partir da chave e do valor, retorna boolean se foi bem sucedido
		
		System.out.println(usuarios.get(1)); // pesqusa o valor pela chave
		
		
		//métodos para percorrer um map
		//1 - pela chave
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		//2 - pelo valor
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		//3 - pela chave e pelo valor ao mesmo tempo
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.println(registro);
			
			//System.out.print(registro.getKey() + " ==> ");
			//System.out.println(registro.getValue());
			
		}
		
		
		
		
		
	}

}
