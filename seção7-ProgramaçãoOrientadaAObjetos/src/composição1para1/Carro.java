package composição1para1;

public class Carro {

	Motor motor = new Motor();
	
	public void ligar() {
		if(!motor.ligado )motor.ligado = true;
		else {
			motor.ligado = false;
		}
	}
	
	public String LigadoOuDesligado() {
		if(motor.ligado) return "Ligado";
		else {
			return "Desligado";
		}
	}
	
	public void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	public void frear() {
		motor.fatorInjecao -= 0.4;
	}
	
	
}
