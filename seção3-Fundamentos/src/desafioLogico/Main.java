package desafioLogico;

public class Main {

	public static void main(String[] args) {
		// caso o trabalho 1 dê certo
				boolean trab1 = false;
				boolean trab2 = false;

				boolean comprouTV50 = trab1 && trab2;
				boolean comprouTV32 = trab1 ^ trab2;
				boolean comprouSorvete = trab1 || trab2;
				
				//operador Unário!
				boolean maisSaudavel = !comprouSorvete;
				
				System.out.println("comprou tv 50\"?" + comprouTV50);
				System.out.println("comprou tv 32\"?" + comprouTV32);
				System.out.println("comprou sorvete? " + comprouSorvete);
				System.out.println("Mais saudável? " + maisSaudavel);
	}

}
