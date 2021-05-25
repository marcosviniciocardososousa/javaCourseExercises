package exemploPadraoObserver;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		//a namorada s� existe para fins academicos, ela pode f�cilmente ser
		//substituida por uma express�o lambda porque o nosso observer neste caso � uma interface funcional
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa via lambda!");
		});
		
		
		porteiro.registrarObservador(namorada);
		porteiro.monitorar();
		
		
	}

}
