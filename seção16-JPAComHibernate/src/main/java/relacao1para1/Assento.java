package relacao1para1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assentos")
public class Assento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*
	 * nao se tem um cliente em assento porque nao existe relacao bi-direcional 
	 * no banco de dados por convencao, pois isso abre 
	 * espaco para inconsistencias e redundancias
	 * 
	 * tem-se uma forma de criar bo-direcionalidade em POO
	 * sem ter ela no banco 
	 */
	@OneToOne(mappedBy = "assento")
	private Cliente cliente;
	/*
	 * a relacao de 1 para 1 esta mapeada pelo atributo 
	 * assento dentro da classe cliente ...
	 */
	
	
	
	private String nome;
	
	public Assento() {
		
	}

	public Assento(String nome) {
		super();
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
