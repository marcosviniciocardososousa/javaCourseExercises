package desafioFinalCorreção;

public class Jantar {

	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz",2);
		Comida c2 = new Comida("FeijÃ£o",1);
		
		Pessoa p = new Pessoa("JoÃ£o",80);
		
		p.apresenta();
		p.comer(c1);
		p.apresenta();
		p.comer(c2);
		p.apresenta();
		
	}

}
