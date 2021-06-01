package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //diz que essa classe esta mapeada para uma tabela no banco de dados
public class Usuario {
	
	@Id 			//define o atributo logo abaixo como id da tabela
	//@GeneratedValue //diz que esse atributo e alto-incremento
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//foi passado o nome da coluna e se ela aceita valores nulos.
	//@Column(name = "table_name", nullable = false) //exemplo de como passar a coluna referente ao atributo
	private String nome;
	
	//@Transient //annotation para atributo que não vai para o banco de dados.
	private String email;
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public Usuario() {
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
}
