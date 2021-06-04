package herancaEmJPA;

import infra.DAO;

public class TesteAluno {

	public static void main(String[] args) {

		DAO<Aluno> alunoDAO = new DAO<Aluno>();
		Aluno aluno1 = new Aluno(123L, "João");
		AlunoBolsista aluno2 = new AlunoBolsista(345L, "maria", 1000);
		
		alunoDAO.incluirAtomico(aluno1);
		alunoDAO.incluirAtomico(aluno2);
		
		alunoDAO.fechar();
		
	}

}
