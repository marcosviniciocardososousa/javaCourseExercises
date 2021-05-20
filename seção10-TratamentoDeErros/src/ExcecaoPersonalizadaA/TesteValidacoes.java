package ExcecaoPersonalizadaA;

import ExemploExceção.Aluno;

public class TesteValidacoes {
	public static void main(String[] args) {
	
		try {
		Aluno aluno = new Aluno("Ana", 7);
		Validar.usuario(aluno);
		}catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}catch (NumeroForaDoIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
		
		
		
	}
}
