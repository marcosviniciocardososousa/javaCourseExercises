package ExemploExceção;

public class ExcecaoCheacadaXExcecaoNaoChecada {

	public static void main(String[] args) {
		
		/**
		 * Temos então 2 grandes grupos de exceções
		 * as checadas são exceções checadas pelo compilador
		 * com a presença delas não é possivel compilar o código
		 * As não checadas passam pelo compilador, mais devem ser tratadas para casos
		 * onde o usuário acesse elas
		 * se não forem verificadas o programa para de compilar.
		 */
		
		try {
			geraErro1();
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();//por ser uma exceção checada é necessário tratar o 
						//erro obrigatoriamente aqui
		}catch (Exception e) {
		}
		
		System.out.println("Fim :)");
		
	}
	//exceção checada
	public static void geraErro1() throws RuntimeException {//declarar erros em tempo de execução não é obrigatório
		//se o for chamado somente com o new não haverá erro, para isso precisa ser chamado o throw
		throw new RuntimeException("Ocorreu um erro #01");//lança erro de execução
	}
	
	//precisa ficar claro na assinatura do método se a exceção é checada ou verificada
	//Exceção checada ou não verificada
	public static void geraErro2 () throws Exception {
		try {
		throw new Exception("Ocorreu um erro #02");//lança erro  de compilação se não for verificado aqui
		}catch (Exception e) {
			System.out.println("Foi gerado um erro aqui");
		}
	}

}
