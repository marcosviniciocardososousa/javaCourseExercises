package relacao1para1;

import javax.persistence.*;


@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	/*
	 * cascate serve para operacoes em cascata
	 * pode-se passar varios parametros dentro de chave.
	 * exemplo: @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	 * 
	 */
	@JoinColumn(name = "assento_id", unique = true)
	private Assento assento;
	
	/*
	 * JoinColumn e uma anotacao especifica para mapear campos que
	 * representam juncao de tabelas
	 * 
	 * O id foi definido como unico 
	 * 
	 * neste caso temos de fato uma ligacao de 1 para  1
	 */
	
	public Cliente() {
		
	}

	public Cliente(String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
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

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
	
	
	
}
