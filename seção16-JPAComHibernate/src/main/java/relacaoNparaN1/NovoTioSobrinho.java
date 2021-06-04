package relacaoNparaN1;

import infra.DAO;

public class NovoTioSobrinho {

	public static void main(String[] args) {

		Tio tio1 = new Tio("Maria");
		Tio tio2 = new Tio("João");
		Sobrinho sobrinho1 = new Sobrinho("Davi");
		Sobrinho sobrinho2 = new Sobrinho("Ana");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		tio1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTios().add(tio1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho2.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT()
		   .incluir(tio1)
		   .incluir(tio2)
		   .incluir(sobrinho1)
		   .incluir(sobrinho2)
		   .fecharT()
		   .fechar();
		
		/*
		 * ao executar foram criadas as respectivas tabelas de tio e sobrinho
		 * tambem foi criada a tabela intermediaria que consolida a relacao
		 * de n para n entre as 2 tabelas.
		 */
		
		
	}
	

}
