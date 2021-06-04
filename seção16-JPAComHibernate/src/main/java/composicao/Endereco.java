package composicao;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {
	
	/*
	 * nao sera criada uma tabela endereco no banco de dados
	 * serao criadas colunas com esses atributos a medida que for sendo 
	 * implementado por entidades.
	 * 
	 * precisa ser declarado no persistence.xml
	 * 
	 * no banco de dados  foi  criada 2 tabelas que contem as colunas
	 * logradouro e complemento.
	 * 
	 */

	private String logradouro;
	private String complemento;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
}
