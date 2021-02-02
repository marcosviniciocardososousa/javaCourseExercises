package equalsEhashcode;

import java.util.HashSet;

public class HashCode {

	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Marcos"));
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Felipe"));
		
		//se o equals e o hashcode não estivessem configurados iria retornar false
		System.out.println(usuarios.contains(new Usuario("Marcos")));
		
		
		
	}

}
