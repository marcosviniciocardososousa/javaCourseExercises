package ExemplosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExemploMatch {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 7.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno>  alunos = Arrays.asList(a1,a2,a3,a4);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();//nega o resultado de aprovado
		
		//Match retorna boolean
		System.out.println(alunos.stream()
				.allMatch(aprovado)//todos os alunos passaram?
				);
		System.out.println(alunos.stream()
				.anyMatch(aprovado)//alguém foi aprovado?
				);
		System.out.println(alunos.stream()
				.noneMatch(reprovado)//todos os alunos não passaram?
				);
		
		
	}

}
