package relacao1para1;

import infra.DAO;

public class ObterCliente {

	public static void main(String[] args) {

		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		
		//acessando assento pelo cliente
		Cliente cliente = daoCliente.obterPeloId(1L);
		System.out.println(cliente.getAssento().getNome());
		System.out.println(cliente.getAssento().getCliente().getNome());
		daoCliente.fechar();
		
		//acessando cliente pelo assento
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPeloId(4L);
		System.out.println(assento.getCliente().getNome());
		
		daoAssento.fechar();
	}

}
