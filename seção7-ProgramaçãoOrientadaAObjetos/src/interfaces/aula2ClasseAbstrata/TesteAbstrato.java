package interfaces.aula2ClasseAbstrata;

public class TesteAbstrato {

	public static void main(String[] args) {

		//Animal a = new Cachorro(); se colocarmos no nível de animal não temos acesso ao método mamar
		Mamifero a = new Cachorro();
		
		System.out.println(a.mover());
		System.out.println(a.mamar());
		System.out.println(a.respirar());
		
		
	}

}
