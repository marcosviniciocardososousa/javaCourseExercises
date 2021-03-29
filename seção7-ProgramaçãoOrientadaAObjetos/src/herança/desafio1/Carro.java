package herança.desafio1;

public class Carro {

	protected int velAcelerar = 5;
	public int velocidade = 0;
	protected boolean controlador = false;
	
	public boolean ligar() {
		if(controlador == false) {
			controlador = true;
			return controlador;
		}
		else {
			controlador = false;
			return controlador;
		}
	}
	
	public boolean acelerar() {
		if(velocidade >= 0) {
			velocidade += velAcelerar;
			return true;
		}else {
			return false;	
		}
		
	}
	
	public boolean frear() {
		if(velocidade > 0) {
			velocidade -= velAcelerar;
			return true;
		}else {
			return false;	
		}
		
	}
	
	
	
}
