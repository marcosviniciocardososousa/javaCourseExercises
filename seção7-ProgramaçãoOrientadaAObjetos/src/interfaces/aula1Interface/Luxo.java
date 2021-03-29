package interfaces.aula1Interface;

public interface Luxo {

	void ligarAr();
	void desligarAr();
	default int velocidadeAr() {
		return 1;
		//deixa de ser obrigatório a implementação do método
		//pode ser alterado na classe que herda a interface caso seja necessário
	}
	
}
