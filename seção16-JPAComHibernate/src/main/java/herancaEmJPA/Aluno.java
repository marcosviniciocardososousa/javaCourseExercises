package herancaEmJPA;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("AL")
/*
 * table per class : para cada classe concreta teremos uma tabela
 * single table    : uma tabela unica para toda a arvore da heranca
 * single table e a estrategia padrao
 * para que o single table funcione corretamente podemos usar o DiscriminatorColumn
 * 
 * usando o joined, na tabela alunas ficara ass colunas que sao comuns para ambas as tabelas
 * e dentro de aluno bolsista ficam as  informacoes pertinentes a alunos com bolsa
 */
public class Aluno {

	@Id
	private Long matricula;
	
	private String nome;
	
	public Aluno() {
	
	}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
	}
	
	
	
}
