package heranca2.desafio1.teste�a.desafio1.teste;

import herança.desafio1.Carro;
import herança.desafio1.Civic;
import herança.desafio1.Ferrari;

public class UsandoCarro {

	public static void main(String[] args) {

		Carro civic  = new Civic();
		System.out.println("Civic ligado? : "+civic.ligar());
		Carro ferrari = new Ferrari();
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
		ferrari.acelerar();
		ferrari.acelerar();
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
