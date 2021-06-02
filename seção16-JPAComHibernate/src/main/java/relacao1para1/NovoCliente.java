package relacao1para1;

import infra.DAO;

public class NovoCliente {

	public static void main(String[] args) {
		
		Assento assento = new Assento("18D");
		Cliente cliente = new Cliente("Joao", assento);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(assento)
			.incluir(cliente)
			.fecharT()
			.fechar();
			
	}
	
}
