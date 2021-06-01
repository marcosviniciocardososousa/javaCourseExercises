package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario {

	public static void main(String[] args) {
		
		//recebe como parametro o nome do persistence-unit relacionado ao banco escolhido
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("seção16-JPAComHibernate");
		//o entityfactory cria o entitymanager...
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
			Usuario usuario = em.find(Usuario.class, 1L);
			//usuario.setNome("Marcelo123123");
			usuario.setEmail("testeDeuCerto@hotmail.com");
			
			em.merge(usuario);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
	
}
