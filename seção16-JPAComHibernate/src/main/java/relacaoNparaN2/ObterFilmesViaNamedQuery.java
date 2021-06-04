package relacaoNparaN2;

import java.util.List;

import infra.DAO;

public class ObterFilmesViaNamedQuery {

	public static void main(String[] args) {

		DAO<Filme> dao = new DAO<>(Filme.class);
		
		//passa-se o nome do named query, nome do parametro de comparacao e valor do parametro
		List<Filme> filmes = dao.consultar("obterfilmesNotaMaiorQue", "nota", 8.5);
		
		for(Filme filme : filmes) {
			System.out.println(filme.getNome());
			
			for(Ator ator : filme.getAtores()) {
				System.out.println(ator.getNome());
			}
			
		}
		
		
		
	}

}
