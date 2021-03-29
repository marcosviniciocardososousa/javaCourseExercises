package herança.desafio2;

public class Ferrari extends Carro {
	
	public Ferrari() {
		super(40);
	}
	
	@Override
	public boolean acelerar() {
		boolean acelerou1 = super.acelerar();
		boolean acelerou2 = super.acelerar();
		boolean acelerou3 = super.acelerar();

		return acelerou1 || acelerou2 || acelerou3;
	
	}
	
	@Override
	public boolean frear() {
		boolean freou1 = super.frear();
		boolean freou2 = super.frear();
		boolean freou3 = super.frear();
		
		return freou1 || freou2 || freou3;
	}
		
}
