package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class DAO<E> {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	static {
		try { 
			emf = Persistence
					.createEntityManagerFactory("seção16-JPAComHibernate");
			
		}catch(Exception e) {
			//log...
			/*
			 * Exemplo de como usar um bloco static para iniciar objetos
			 * E NECESSARIO USAR O TRY CATH NESTES CASOS
			 * 
			 * serve a todas as instancias dessa classe
			 */
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	/*
	 * os 2 construtores capturam o nome da classe que e passada como parametro
	 */
	
	public DAO<E> abrirT(){ //metodo que abre uma transacao
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharT(){ //o T e de transacao
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;
	}
	
	public DAO<E> incluirAtomico(E entidade){//abre fecha e inclui o dado
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public List<E> obterTodos(int qtde, int deslocamento){//limit e offset - paginam a consulta
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		TypedQuery<E> query = em.createQuery(jpql,classe);
		query.setMaxResults(qtde); //limit
		query.setFirstResult(deslocamento);//offset
		return query.getResultList();
		
	}
	public List<E> obterTodos(){
		return this.obterTodos(10,0); //como houve a sobrecarga ele esta chamando o metodo acima e nao esse
		//assim conseguimos definir um limite do obter todos
	}
	
	//consulta usando named query
	public List<E> consultar (String nomeConsulta, Object... params){
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for(int i = 0; i < params.length; i += 2) {
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		
		return query.getResultList();
	}
	
	public E obterPeloId(Object id) {
		return em.find(classe, id);
	}
	
	public void fechar() {
		em.close();
	}
	
	
}
