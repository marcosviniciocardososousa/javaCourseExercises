package ExemplosStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ExemploDistinct {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Luna", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Gabi", 10);
		
		List<Aluno>  alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		//para que o distinct funcione corretamente � necess�rio implementar equals e hashcode
		System.out.println("Usando Distinct: ");
		alunos.stream()
			.distinct().forEach(System.out::println);
		
		
	}

}
