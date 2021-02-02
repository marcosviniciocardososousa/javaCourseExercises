package collections;

import java.util.ArrayList;

public class EstruturaList {

	public static void main(String[] args) {
		/*
		 * ASSOCIAMOS O ARRAY A CLASSE LIST USUARIO E A CADA NOVO ADD GERAMOS UMA INSTÂNCIA DA CLASSE, 
		 * DEFINIMOS O CONSTRUTOR PARA RECEBER UM NOME
		 * NESTE CASO O ÚNICO PARÂMETRO QUE ADD ACEITA E O PARÂMETRO DO CONSTRUTOR
		 * 	PARA FUNCIONAR PRECISAMOS IMPLEMENTAR O EQUALS E HASHCODE NA CLASSE.
		 * */
		
		ArrayList<ListUsuario> lista = new ArrayList<ListUsuario>();
		
		ListUsuario u1 = new ListUsuario("Ana");
		
		
		//como adicionar dados a uma lista linkada a uma classe
		lista.add(u1);
		lista.add(new ListUsuario("marcos"));
		lista.add(new ListUsuario("felipe"));
		lista.add(new ListUsuario("roberto"));
		
		//como vizualizar os dados da lista
		for(ListUsuario u : lista) {
			System.out.println(u.nome);
		}
		
		System.out.println();
		
		System.out.println(lista.get(0).nome); // pesquisar dado pelo índice (começa no 0 como o array).
		System.out.println("Tem? "+ lista.contains(new ListUsuario("Lia"))); // pesquisa pelo nome do usuário
		
		//remover dado da lista
		lista.remove(1); //remoção pelo índice
		lista.remove(new ListUsuario("felipe")); //remoção diretamente pelo nome.
		
		
		
		
	}

}
