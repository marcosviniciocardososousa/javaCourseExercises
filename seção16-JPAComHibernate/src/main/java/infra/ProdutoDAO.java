package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {
	/*
	 * SERVE PARA APLICAR LOGICA DE NEGOCIO A TRANSACAO
	 * EXEMPLO, FAZER OPERACOES RELACIONADAS AO ESTOQUE.
	 */
	
	public ProdutoDAO() {
		super(Produto.class);
	}

}
