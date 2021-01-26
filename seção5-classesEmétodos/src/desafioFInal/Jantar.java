package desafioFInal;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marcos",100);
		Comida c1 = new Comida("Arroz",2);
		Comida c2 = new Comida("Feijão",2);
		System.out.println("Antes de comer:"+p1.peso+" KG");
		p1.comer(c1.peso+c2.peso);
		System.out.println("Depois que comeu:"+ p1.peso+" KG");
		
	}

}
