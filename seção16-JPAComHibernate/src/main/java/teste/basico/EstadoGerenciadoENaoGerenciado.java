package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class EstadoGerenciadoENaoGerenciado {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("seção16-JPAComHibernate");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
			Usuario usuario = em.find(Usuario.class, 1L);
			usuario.setEmail("testeDeuCe[rto@hotmail.com");
			
			em.detach(usuario); //***********
			
			
			//em.merge(usuario);
			
			/*
			 * Mesmo com o merge comentado a transacao ocorrera
			 * porque o objeto se encontra dentro de uma transacao
			 * mesmo sem o merge a transacao precisa ser efetuada
			 * a menos que seja explicito que nao seja para faze-la
			 * 
			 * Para tirar a instancia do objeto do estado gerenciado
			 * usasse o detach
			 * 
			 * com o detach o estado do objeto so sera sincronizado
			 * caso se use o merge
			 */
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
	
}
