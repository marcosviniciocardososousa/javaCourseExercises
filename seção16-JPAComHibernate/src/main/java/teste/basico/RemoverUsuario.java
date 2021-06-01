package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("seção16-JPAComHibernate");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		
		if(usuario != null) {
			em.getTransaction().begin();
				em.remove(usuario);
			em.getTransaction().commit();
		}
		
		em.close();
		emf.close();
	}

}
