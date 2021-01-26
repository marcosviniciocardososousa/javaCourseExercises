package desafioFinalCorreção;

public class Jantar {

	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz",2);
		Comida c2 = new Comida("Feijão",1);
		
		Pessoa p = new Pessoa("João",80);
		
		p.apresenta();
		p.comer(c1);
		p.apresenta();
		p.comer(c2);
		p.apresenta();
		
	}

}
