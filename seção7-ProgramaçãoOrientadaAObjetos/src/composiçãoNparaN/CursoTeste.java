package composiçãoNparaN;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("maria");
		Aluno aluno2 = new Aluno("João");
		Aluno aluno3 = new Aluno("José");
		
		Curso curso1 = new Curso("POO java");
		Curso curso2 = new Curso("Reat Native");
		Curso curso3 = new Curso("Eletrônica");
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		
		curso2.addAluno(aluno1);
		curso2.addAluno(aluno3);
		
		curso3.addAluno(aluno1);
		curso3.addAluno(aluno2);
		curso3.addAluno(aluno3);
		
		for(Aluno aluno : curso1.alunos) { //foreach para saber os alunos matriculados em um curso.
			System.out.println("Estou matriculado no curso 1 eu sou o "+aluno.nome);
		}
		System.out.println();
		for(Aluno aluno : curso2.alunos) {
			System.out.println("Estou matriculado no curso 2 eu sou o "+aluno.nome);
		}
		System.out.println();
		for(Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso 3 e eu sou o "+aluno.nome);
		}
		
		
	}

}
