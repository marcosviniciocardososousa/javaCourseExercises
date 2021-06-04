package relacaoNparaN2;

import infra.DAO;

public class ObterMediaFilmes {

	public static void main(String[] args) {

		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		
		NotaFilme nota = dao.consultarUm("ObterMediaGeralDosFilmes");
		System.out.println(nota.getMedia());
		
		
		dao.fechar();
	}

}
