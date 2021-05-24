package usandoGenericsEmMetodos;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("JS","PHP","C++","JAVA");
		List<Integer> nums = Arrays.asList(1,2,4,5,6,7,8);
		
		String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);//precisa de conversão pq responde com um generics
		System.out.println(ultimaLinguagem);
		
		Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero);
		
		//-------------------------------
		/**
		 * Como o tipo das listas foi definido então usando generics ele entende que o tipo já foi definido.
		 */
		
		String ultimaLinguagem1 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem1);
		
		Integer ultimoNumero1 = ListaUtil.getUltimo2(nums);
		System.out.println(ultimoNumero1);
		
	}

}
