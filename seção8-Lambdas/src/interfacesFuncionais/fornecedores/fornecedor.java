package interfacesFuncionais.fornecedores;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class fornecedor {

	public static void main(String[] args) {
		//um supplier não recebe nada e te devolve algo.
		
		Supplier< List<String> > umaLista = () -> Arrays.asList("Ana","Bia","Lia","Gui");
		
		System.out.println(umaLista.get());
		
		
		
	}
	
}
