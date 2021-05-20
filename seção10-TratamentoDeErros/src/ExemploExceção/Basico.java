package ExemploExce��o;

public class Basico {

	public static void main(String[] args) {
		Aluno a1 = null;
		
		
		try {
			imprimirAluno(a1);
			
		}catch (NullPointerException excecao) {
			System.out.println("Aluno n�o carrega nenhuma caracteristica = null");
			
		}
		
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Divis�o por zero registrada!");
		}
		
		
	}

	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
	
}
