package usandoGenericsEmMetodos;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1); //este tipo de constru��o garante que n�o haver� um tipo definido
											//deixando de ser necess�rio o cast
	}
	
}
