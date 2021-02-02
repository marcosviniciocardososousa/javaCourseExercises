package equalsEhashcode;

public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro silva";
		u1.email = "pedro@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro silva";
		u2.email = "pedro@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(12));
		
	}

}
