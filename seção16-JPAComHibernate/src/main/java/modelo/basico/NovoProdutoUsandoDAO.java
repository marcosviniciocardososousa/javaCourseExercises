package modelo.basico;

import infra.DAO;

public class NovoProdutoUsandoDAO {

	public static void main(String[] args) {

		Produto produto = new Produto("Monitor", 789.95);
		DAO<Produto> dao = new DAO<Produto>(Produto.class);
		
		dao.abrirT().incluir(produto).fecharT().fechar();
		
	}

}
