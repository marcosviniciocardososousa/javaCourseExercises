package encapsulamento.desafioEncapsulamento;

public class Jantar {

	public static void main(String[] args) {
		
		var convidado = new Pessoa(97);
		
		var arroz = new Arroz(0.100);
		var feijao = new Feijão(0.200);
		var sorvete = new Sorvete(0.450);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		convidado.comer(sorvete);
		
		System.out.println(convidado.getPeso());
		
	}

}
