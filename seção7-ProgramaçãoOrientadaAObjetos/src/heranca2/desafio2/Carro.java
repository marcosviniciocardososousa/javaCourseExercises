package heranca2.desafio2§a.desafio2;

public class Carro {

	final int VELOCIDADE_LIMITE;
	int velAcelerar = 5;
	int velocidade = 0;
	boolean controlador = false;
	
	public Carro(int velocidadeLimite) {
		this.VELOCIDADE_LIMITE = velocidadeLimite;
	}
	
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
		if(velocidade + 5 > VELOCIDADE_LIMITE) {
			velocidade = VELOCIDADE_LIMITE;
			return false;
		}else {
			velocidade += velAcelerar;
			return true;	
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
