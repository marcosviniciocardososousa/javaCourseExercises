package collections;

import java.util.HashSet;

public class EstruturaSetHeterogenea {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		
		//Neste caso ele faz a conversão de tipo primitivo para wrapper.
		conjunto.add(1.2); // 	   	 -> Double
		conjunto.add(true); // 		 -> Boolean
		conjunto.add("Teste"); // 	 -> String
		conjunto.add(1); // 		 -> Integer
		conjunto.add('x'); // 		 -> Char
		
		System.out.println(conjunto.size());// -> método que retorna o tamanho do conjunto.
		
		//ele não contará esse novo elemento pois ele não aceita repetição. não dá erro, só deixa de adicionar
		conjunto.add("Teste");
		System.out.println(conjunto.size());
		
		//ao remover um item do conjunto ele retorna true caso consiga fazer a remoção bem sucedida
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println(conjunto.size());
		
		//perguntar se o conjunto contém um elemento.
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains("Teste"));// não contem esse item pois o removemos anteriormente.
		
		
		//outra forma de instânciar o set é assim:
		HashSet nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);// a collection já implementa a forma de mostrar os dados como uma string
		
		//conjunto.addAll(nums); //união entre 2 conjuntos
		//conjunto.retainAll(nums);//insterscção (valor em comum nos 2 conjuntos)
		//conjunto.clear();//limpar todos os dados do conjunto.
		System.out.println(conjunto);
		
		
		
	}

}
