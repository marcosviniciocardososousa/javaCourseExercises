package criandoConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException{

		Connection conexao = FabricaConexao.getConexao();
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = input.nextLine();
		
		//String sql = "insert into pessoas (nome) values ('" + nome + "')";
		/*
		 * N�O SE USA CONCATENA��O DE STRINGS PARA FAZER UM INSERT NO BANCO DE DADOS, PORQUE ABRE UMA BRECHA PARA
		 * UM ATAQUE DE SQL INJECTION.
		 * exemplo: -> insert into pessoas (nome) values ('nome'); select * from pessoas;
		 */
		
		//FORMA CORRETA DE ORGANIZAR UM INSERT
		String sql = "insert into pessoa (nome) values (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		/*
		 * tudo que foi passado em nome ser� inserido como uma string, n�o sendo possivel um sql injection
		 * o primeiro par�metro e a ordem do ? e o segundo e a valor que ser� inserido nele
		 */
		
		stmt.execute();
		
		
		System.out.println("Pessoa incluido com sucesso...");
		
		input.close();
		conexao.close();
		
	}

}
