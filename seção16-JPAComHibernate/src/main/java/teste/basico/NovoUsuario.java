package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {

		/**
		 * ENTITYMANAGERFACTORY
		 * foi passado como parametro o nome da unidade em java.persistence
		 * podemos utilizar varios bancos ao mesmo tempo
		 * por exemplo, banco legado e banco novo
		 * 
		 * ENTITYMANAGER
		 * ele quem invoca toda a mecânica de persistencia
		 * 
		 */
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("seção16-JPAComHibernate");
		EntityManager em = emf.createEntityManager();
				
		Usuario novoUsuario = new Usuario("Andre souza", "andreSouza123@gmail.com");
		
		
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}

}
