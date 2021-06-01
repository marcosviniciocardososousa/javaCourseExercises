package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuarioUnicoSimples {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("seção16-JPAComHibernate");
		EntityManager em = emf.createEntityManager();
				
		Usuario usuario = em.find(Usuario.class, 1L);
		System.out.println(usuario);
		
		em.close();
		emf.close();
		
		
		
	}

}
