package desafio01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import criandoConexao.Pessoa;

public class DesafioMain {

	public static void main(String[] args) throws SQLException {
		//CRIANDO A CONEXAO E O OBJ SCANNER
		Scanner input = new Scanner(System.in);
		Connection conexao = DbconnectionService.getConnection();
		
		//MENUZINHO
		System.out.println("Informe o nome ou parte dele para efetuar uma pesquisa...");
		String nome = input.nextLine();
		
		//PREPARA A QUERY
		String sql = "select * from pessoa where nome like ?";
		PreparedStatement operacao = conexao.prepareStatement(sql);
		operacao.setString(1, "%" + nome + "%");
		ResultSet resultado = operacao.executeQuery();
		
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		//ARMAZENA A QUERY EM UMA LISTA
		while(resultado.next()) {
			int id = resultado.getInt("codigo");
			String nomes = resultado.getString("nome");
			pessoas.add(new Pessoa(id, nomes));
		}
		
		//MOSTRA A LISTA
		for(Pessoa retorno : pessoas) {
			System.out.println("ID: " + retorno.getCodigo() + " NOME: " + retorno.getNome());
		}
		
		//FECHA AS CONEXÕES E DESALOCA OS OBJETOS DA MEMORIA...
		input.close();
		conexao.close();
		
	}

}
