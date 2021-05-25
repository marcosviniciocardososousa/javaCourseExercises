package exemploPadraoObserver;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		//a namorada só existe para fins academicos, ela pode fácilmente ser
		//substituida por uma expressão lambda porque o nosso observer neste caso é uma interface funcional
		porteiro.registrarObservador(e -> {
			System.out.println("Surpresa via lambda!");
		});
		
		
		porteiro.registrarObservador(namorada);
		porteiro.monitorar();
		
		
	}

}
