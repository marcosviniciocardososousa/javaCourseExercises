package interfaces.aula2ClasseAbstrata;

public abstract class Mamifero extends Animal{

	@Override
	public final String mover() {//definir um método como final proteje ele contra sobre-escrita nas classes que o herdam
		return "Saindo do lugar";
	}
	
	public abstract String mamar();
	
	
	
}
