package criandoConexao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBancoPeloJava {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		
		Statement statement = conexao.createStatement();
		statement.execute("create database if not exists curso_java_jdbc");//statement fica dentro de java.sql, recebe um argumento sql diretamente
		System.out.println("Banco criado com sucesso...");
		
		conexao.close();
		
	}
}
