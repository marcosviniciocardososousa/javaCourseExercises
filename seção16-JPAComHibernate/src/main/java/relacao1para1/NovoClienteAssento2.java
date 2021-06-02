package relacao1para1;

import infra.DAO;

public class NovoClienteAssento2 {

	public static void main(String[] args) {

		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Felipe", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		for(int i = 0 ; i < 10; i++) {
		dao.incluirAtomico(cliente);
		}
		
	}

}
