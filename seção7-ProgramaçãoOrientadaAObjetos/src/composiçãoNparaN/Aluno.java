package composiçãoNparaN;

import java.util.ArrayList;

public class Aluno {

	String nome = "";
	final ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	public void addCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	
}
