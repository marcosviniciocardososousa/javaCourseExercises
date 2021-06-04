package relacao1paraN;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date data;
	
	public Pedido() {
		this(new Date());
	}

	public Pedido(Date data) {
		this.data = data;
	}
	
	//esse e o valor default do fetch (...ToOne -> EAGER)
	@OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)
	//LAZY:traz de forma tardia, nao automatica, precisa ser explicitado
	// instancia dessa classe em itemPedido...
	
	/*
	 * a diferenca entre lazy e eager e a performance
	 * lazy e mais rapido que eager, e as vezes e mais 
	 * conveniente manter fetch por padrao
	 */
	
	private List<ItemPedido> itens;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
	
	
	
	
	
}
