package interfaces.aula1Interface;

public class Ferrari extends Carro implements Esportivo, Luxo{
	//implements é usado para dizer que uma determinada classe implementa uma interface.
	
	boolean estadoTurbo = false;
	boolean estadoAr    = false;
	
	@Override
	public boolean acelerar() {
		if(!estadoTurbo) {
			boolean acelerou1 = super.acelerar();
			boolean acelerou2 = super.acelerar();
			boolean acelerou3 = super.acelerar();
			return acelerou1 || acelerou2 || acelerou3;
		}else {
			boolean acelerou1 = super.acelerar();
			boolean acelerou2 = super.acelerar();
			boolean acelerou3 = super.acelerar();
			boolean acelerou4 = super.acelerar();
			return acelerou1 || acelerou2 || acelerou3 || acelerou4;
		}
		
	}
	
	@Override
	public boolean frear() {
		boolean freou1 = super.frear();
		boolean freou2 = super.frear();
		boolean freou3 = super.frear();
		
		return freou1 || freou2 || freou3;
	}

	@Override
	public void ligarTurbo() {
		estadoTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		estadoTurbo = false;
	}

	@Override
	public void ligarAr() {
		estadoAr = true;
	}

	@Override
	public void desligarAr() {
		estadoAr = false;
	}
		
}
