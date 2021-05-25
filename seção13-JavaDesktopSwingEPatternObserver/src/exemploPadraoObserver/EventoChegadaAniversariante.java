package exemploPadraoObserver;

import java.util.Date;

public class EventoChegadaAniversariante {

	private final Date momentoQueOcorreuEvento;
	
	public EventoChegadaAniversariante(Date momentoQueOcorreuEvento) {
		super();
		this.momentoQueOcorreuEvento = momentoQueOcorreuEvento;
	}



	public Date getMomentoQueOcorreuEvento() {
		return momentoQueOcorreuEvento;
	}
	
	
	
}
