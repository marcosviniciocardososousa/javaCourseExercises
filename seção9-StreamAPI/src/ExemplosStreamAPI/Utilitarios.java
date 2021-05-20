package ExemplosStreamAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {

	public final static UnaryOperator<String> maiuscula 
			= n -> n.toLowerCase();
	public final static UnaryOperator<String> primeiraLetra 
			= n -> n.charAt(0) + "";
	public final static String grito (String n) {
			return n + "!!!";
			}
	
	
}
