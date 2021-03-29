package interfaces.aula1.teste;

import interfaces.aula1Interface.*;

public class UsandoCarro {

	public static void main(String[] args) {

		Carro civic  = new Civic();
		System.out.println("Civic ligado? : "+civic.ligar());
		Ferrari ferrari = new Ferrari();
		System.out.println("Ferrari ligado? : "+ferrari.ligar());
		
		System.out.println();//espaço
		
		//velocidade ao ligar os carros;
		System.out.println("Velocidade Civic : "+civic.velocidade);
		System.out.println("Velocidade Ferrari : "+ferrari.velocidade);
		System.out.println();
		
		//acelerando civic
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		//acelerando ferrrari
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.desligarTurbo();
		ferrari.acelerar();
		
		System.out.println("Velocidade Civic : "+civic.velocidade);
		System.out.println("Velocidade Ferrari : "+ferrari.velocidade);
		System.out.println();
		
		//freando civic
		civic.frear();
		civic.frear();
		civic.frear();
		civic.frear();
		
		//freando ferrari
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		ferrari.frear();
		
		
		System.out.println("Velocidade Civic : "+civic.velocidade);
		System.out.println("Velocidade Ferrari : "+ferrari.velocidade);
		System.out.println();
		
		
	}

}
