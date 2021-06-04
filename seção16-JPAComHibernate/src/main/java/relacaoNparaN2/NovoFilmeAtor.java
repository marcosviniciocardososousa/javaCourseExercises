package relacaoNparaN2;

import infra.DAO;

public class NovoFilmeAtor {

	public static void main(String[] args) {

		Filme filmeA = new Filme("Star wars ep 4", 8.7);
		Filme filmeB = new Filme("O fugitivo", 8.9);
		
		Ator atorA = new Ator("Harisson Ford");
		Ator atrizB = new Ator("Carrie Fisher");
		
		filmeB.adicionarAtor(atorA);
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeA);
		/*
		 * em cascata e como tudo esta relacionado
		 * ao adionar o filme1 foi adicionado os atores envolvidos e os filmes que estao
		 * envolvidos, ou seja, a partir do filmeA todos os
		 *  filmes e atores foram incluidos
		 */
		
	}

}
