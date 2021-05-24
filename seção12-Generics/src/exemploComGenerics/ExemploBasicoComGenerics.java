package exemploComGenerics;

public class ExemploBasicoComGenerics<TIPO> {

	//O tipo ainda n foi confirmado por isso ele é generico.
	//É MAIS COMUMENTE VISTO O GENERICS SOMENTE COM 1 LETRA EXEMPLO <T,S>
	private TIPO coisa;
	
	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}
	
	public TIPO abrir() {
		return coisa;
	}
	
	
}
