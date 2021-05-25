package exemploPadraoObserver;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ChegadaAniversarianteObserver> observadores = new ArrayList<>();
	
	public  void registrarObservador(ChegadaAniversarianteObserver observador) {
		observadores.add(observador);
	}
	
	//normalmente quem implementa este método monitorar é algum framework
	public void monitorar() {
		Scanner input = new  Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou? ");
			valor = input.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				//criar o evento
				EventoChegadaAniversariante evento = 
						new EventoChegadaAniversariante(new Date());
				
				//notificar observadores
				observadores.stream()
					.forEach(o -> o.chegou(evento));
				
			}else {
				System.out.println("Alarme falso!");
			}
		}
		
			input.close();
		
	}
	
	
}
