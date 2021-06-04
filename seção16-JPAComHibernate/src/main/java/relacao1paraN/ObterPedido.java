package relacao1paraN;

import infra.DAO;

public class ObterPedido {

	public static void main(String[] args) {

		/*
		 * PARA SE OBTER OS PEDIDOS E NECCESSARIO
		 * CONFIGURAR A RELACAO DE 1 PARA N TAMBEM 
		 * NO MUNDO POO, MANTIDO SOMENTE NO MUNDO SQL
		 * NAO SERA POSSIVEL OBTER OS DADOS COMPLETOS.
		 */
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		Pedido pedido = dao.obterPeloId(1L);
		dao.fechar();
		for(ItemPedido item : pedido.getItens()) {//aqui temos um exemplo de select lazy - de forma tardia...
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
		
		
	}

}
