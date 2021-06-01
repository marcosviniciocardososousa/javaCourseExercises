package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterVariosUsuariosComJPQL {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("seção16-JPAComHibernate");
		EntityManager em = emf.createEntityManager();
				
//		String jpql = "select u from Usuario u";
//		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//		query.setMaxResults(5);//limita a quantidade de usuarios que retornara
		
//		List<Usuario> usuarios = query.getResultList(); //armazena o resultado na lista
		
		//podemos tambem encadear um metodo no outro
		List<Usuario> usuarios = em
				.createQuery("select u from Usuario u", Usuario.class)
				//jpql referese a classe e nao ao banco, a partir da 
				//logica da classe busca-se a logica do banco
				.setMaxResults(3)
				.getResultList();
		
		for(Usuario u : usuarios) {
			System.out.println(u);
		}
		
		em.close();
		emf.close();
		
		
		
	}

}
