package ExemploExce��o;

public class ExcecaoCheacadaXExcecaoNaoChecada {

	public static void main(String[] args) {
		
		/**
		 * Temos ent�o 2 grandes grupos de exce��es
		 * as checadas s�o exce��es checadas pelo compilador
		 * com a presen�a delas n�o � possivel compilar o c�digo
		 * As n�o checadas passam pelo compilador, mais devem ser tratadas para casos
		 * onde o usu�rio acesse elas
		 * se n�o forem verificadas o programa para de compilar.
		 */
		
		try {
			geraErro1();
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();//por ser uma exce��o checada � necess�rio tratar o 
						//erro obrigatoriamente aqui
		}catch (Exception e) {
		}
		
		System.out.println("Fim :)");
		
	}
	//exce��o checada
	public static void geraErro1() throws RuntimeException {//declarar erros em tempo de execu��o n�o � obrigat�rio
		//se o for chamado somente com o new n�o haver� erro, para isso precisa ser chamado o throw
		throw new RuntimeException("Ocorreu um erro #01");//lan�a erro de execu��o
	}
	
	//precisa ficar claro na assinatura do m�todo se a exce��o � checada ou verificada
	//Exce��o checada ou n�o verificada
	public static void geraErro2 () throws Exception {
		try {
		throw new Exception("Ocorreu um erro #02");//lan�a erro  de compila��o se n�o for verificado aqui
		}catch (Exception e) {
			System.out.println("Foi gerado um erro aqui");
		}
	}

}
