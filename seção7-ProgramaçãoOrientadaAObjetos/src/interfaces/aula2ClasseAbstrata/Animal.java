package interfaces.aula2ClasseAbstrata;

public abstract class Animal {

	public String respirar() {
		return "CO2";
	}
	public abstract String mover();//cada animal de move de uma maneira, o método foi definido como abstrato
	
}
