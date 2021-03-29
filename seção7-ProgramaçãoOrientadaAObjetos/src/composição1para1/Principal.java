package composição1para1;

public class Principal {

	public static void main(String[] args) {

		Carro c = new Carro();
		
		System.out.println(c.LigadoOuDesligado()); //perguntamos se está ligado
		
		c.ligar();
		
		System.out.println(c.LigadoOuDesligado()); //como não estava ligamos ele
		
		System.out.println(c.motor.giros());
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		System.out.println(c.motor.giros());
		
		c.frear();
		c.frear();
		c.frear();
		c.frear();
	
		
		System.out.println(c.motor.giros());
		
		//relação bi-direcional (1 carro tem 1 motor)
		c.motor.carro.motor.carro.motor.carro.acelerar();
		
	}

}
