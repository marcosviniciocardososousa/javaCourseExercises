package modelo.basico;

import java.util.List;

import infra.ProdutoDAO;

public class ObterProdutoUsandoDAO {

	public static void main(String[] args) {

		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto : produtos) {
			System.out.println("ID : " + produto.getId() + " NOME : " 
					+ produto.getNome() + " PRECO : " + produto.getPreco());
		}
		
		//calculando o valor total usando lambdas
		double precoTotal = produtos.stream()
				.map(p -> p.getPreco())
				.reduce(0.0, (t, p) -> t + p)
				.doubleValue();
				;
		System.out.println("TOTAL: " + precoTotal);
		
		
	}

}
